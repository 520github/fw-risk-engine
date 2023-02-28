package org.sunso.risk.expression;

public class NotContainsExpression implements Expression {
    private String expressionName;

    @Override
    public Expression setExpressionName(String expressionName) {
        this.expressionName = expressionName;
        return this;
    }

    @Override
    public String getExpressionName() {
        return expressionName;
    }

    @Override
    public boolean compare(String targetValue, String dataIndicatorValue) {
        return false;
    }
}
