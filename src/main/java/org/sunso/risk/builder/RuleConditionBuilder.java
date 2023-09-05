package org.sunso.risk.builder;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.expression.Expression;
import org.sunso.risk.relation.Relation;
import org.sunso.risk.rule.DefaultRuleCondition;
import org.sunso.risk.rule.RuleCondition;

public class RuleConditionBuilder {

    private Expression expression;
    private Relation relation;
    private String targetValue;

    private DataIndicator dataIndicator;

    public static RuleConditionBuilder create() {
        return new RuleConditionBuilder();
    }

    public RuleConditionBuilder dataIndicator(DataIndicator dataIndicator) {
        this.dataIndicator = dataIndicator;
        return this;
    }

    public RuleConditionBuilder expression(Expression expression) {
        this.expression = expression;
        return this;
    }

    public RuleConditionBuilder relation(Relation relation) {
        this.relation = relation;
        return this;
    }

    public RuleConditionBuilder targetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    public RuleCondition build() {
        return DefaultRuleCondition.create()
                .setExpression(expression)
                .setRelation(relation)
                .setTargetValue(targetValue)
                .setDataIndicator(dataIndicator);
    }

}
