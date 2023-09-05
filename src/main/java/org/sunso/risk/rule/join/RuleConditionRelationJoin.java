package org.sunso.risk.rule.join;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;
import org.sunso.risk.rule.RuleCondition;

/**
 * 规则条件内部比较逻辑
 */
public class RuleConditionRelationJoin extends AbstractRelationJoin {
    private RuleCondition ruleCondition;

    public static RuleConditionRelationJoin create(RuleCondition ruleCondition) {
        return new RuleConditionRelationJoin(ruleCondition);
    }

    public RuleConditionRelationJoin(RuleCondition ruleCondition) {
        this.ruleCondition = ruleCondition;
    }

    @Override
    public boolean join(StrategyRequest request, RuleConditionExecuteResponse ruleConditionExecuteResponse) {
        //数据指标计算值
        String calValue = getDataIndicatorValue(request);
        //比较目标值
        String targetValue = ruleCondition.getTargetValue();
        //根据表达式进行比较
        boolean compareResult = ruleCondition.getExpression().compare(targetValue, calValue);
        if (compareResult) {
            StringBuffer sb = new StringBuffer();
            sb.append("规则条件命中:");
            sb.append(ruleCondition.getDataIndicator().getDataIndicatorName());
            sb.append("(").append(ruleCondition.getDataIndicator().getDataIndicatorKey()).append(") ");
            sb.append("---(").append(calValue).append(" ");
            sb.append(ruleCondition.getExpression().getExpressionName());
            sb.append(" ").append(targetValue).append(")").append(" = ").append(compareResult);
            System.out.println(sb);
        }
        //System.out.println("calValue:" + calValue);
        //System.out.println("targetValue:" + targetValue);
        //设置规则条件的计算结果
        ruleConditionExecuteResponse.addRuleCondition(ruleCondition, calValue, compareResult);
        return compareResult;
    }

    /**
     * 获取数据指标计算值
     * 根据数据指标路由器去查找对应的计算逻辑
     * @param request
     * @return
     */
    private String getDataIndicatorValue(StrategyRequest request) {
        return request.getDataIndicatorRoute().calDataIndicator(ruleCondition.getDataIndicator(), request.getContext());
    }
}
