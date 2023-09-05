package org.sunso.risk.response;

import org.sunso.risk.rule.RuleCondition;

/**
 * 规则条件执行结果
 */
public class RuleConditionExecuteResponse {
    /**
     * 规则条件执行结果
     */
    StringBuffer ruleConditionResult = new StringBuffer();

    public static RuleConditionExecuteResponse create() {
        return new RuleConditionExecuteResponse();
    }

    /**
     * 添加规则条件执行结果
     * @param ruleCondition
     * @param calValue
     * @param isHit
     */
    public void addRuleCondition(RuleCondition ruleCondition, String calValue, boolean isHit) {
        ruleConditionResult.append(ruleCondition.getRelation().getRelationKey()).append(" "); //关系 and或or
        ruleConditionResult.append("").append(ruleCondition.getDataIndicator().getDataIndicatorName());// 数据指标
        ruleConditionResult.append(" [").append(calValue).append(" "); // 数据指标计算值
        ruleConditionResult.append(ruleCondition.getExpression().getExpressionName()).append(" "); // 比较表达式, 大于、小于、等于
        ruleConditionResult.append(ruleCondition.getTargetValue()).append("]"); // 比较目标值
        ruleConditionResult.append(" = ").append(isHit).append(";"); // 比较结果
    }

    public String getRuleConditionResult() {
        return ruleConditionResult.toString();
    }
}
