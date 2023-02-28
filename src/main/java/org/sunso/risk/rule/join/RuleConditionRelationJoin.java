package org.sunso.risk.rule.join;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.MockDataIndicatorRoute;
import org.sunso.risk.data.indicator.DataIndicatorRoute;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;
import org.sunso.risk.rule.RuleCondition;

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
        String calValue = getDataIndicatorValue(request);
        String targetValue = ruleCondition.getTargetValue();
        boolean compareResult = ruleCondition.getExpression().compare(targetValue, calValue);
        System.out.println("calValue:" + calValue);
        System.out.println("calValue:" + targetValue);
        ruleConditionExecuteResponse.addRuleCondition(ruleCondition, calValue, compareResult);
        return compareResult;
    }

    private String getDataIndicatorValue(StrategyRequest request) {
        return request.getDataIndicatorRoute().calDataIndicator(ruleCondition.getDataIndicator(), request.getContext());
    }
}
