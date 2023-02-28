package org.sunso.risk.expression;

public class NotEqualExpression implements Expression {
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
        return !targetValue.equalsIgnoreCase(dataIndicatorValue);
    }
}
