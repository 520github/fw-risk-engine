package org.sunso.risk.rule;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.expression.Expression;
import org.sunso.risk.relation.Relation;

public class DefaultRuleCondition implements RuleCondition {
    private DataIndicator dataIndicator;
    private Expression expression;
    private Relation relation;
    private String targetValue;

    public static DefaultRuleCondition create() {
        return new DefaultRuleCondition();
    }

    @Override
    public RuleCondition setDataIndicator(DataIndicator dataIndicator) {
        this.dataIndicator = dataIndicator;
        return this;
    }

    @Override
    public DataIndicator getDataIndicator() {
        return dataIndicator;
    }

    @Override
    public RuleCondition setExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public Expression getExpression() {
        return expression;
    }

    @Override
    public RuleCondition setRelation(Relation relation) {
        this.relation = relation;
        return this;
    }

    @Override
    public Relation getRelation() {
        return relation;
    }

    @Override
    public RuleCondition setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public String getTargetValue() {
        return targetValue;
    }
}
