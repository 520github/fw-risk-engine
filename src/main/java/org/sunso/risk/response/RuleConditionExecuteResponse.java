package org.sunso.risk.response;

import org.sunso.risk.rule.RuleCondition;

public class RuleConditionExecuteResponse {
    StringBuffer ruleConditionResult = new StringBuffer();

    public static RuleConditionExecuteResponse create() {
        return new RuleConditionExecuteResponse();
    }

    public void addRuleCondition(RuleCondition ruleCondition, String calValue, boolean isHit) {
        ruleConditionResult.append(ruleCondition.getRelation().getRelationKey()).append(" ");
        ruleConditionResult.append("").append(ruleCondition.getDataIndicator().getDataIndicatorName());
        ruleConditionResult.append(" [").append(calValue).append(" ");
        ruleConditionResult.append(ruleCondition.getExpression().getExpressionName()).append(" ");
        ruleConditionResult.append(ruleCondition.getTargetValue()).append("]");
        ruleConditionResult.append(" = ").append(isHit).append(";");
    }

    public String getRuleConditionResult() {
        return ruleConditionResult.toString();
    }
}
