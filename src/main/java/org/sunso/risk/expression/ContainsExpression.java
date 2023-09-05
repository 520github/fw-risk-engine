package org.sunso.risk.expression;

/**
 * 包含表达式
 */
public class ContainsExpression implements Expression {
    private String expressionName ;

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
        if (targetValue == null || dataIndicatorValue == null) {
            return false;
        }
        return dataIndicatorValue.contains(targetValue);
    }
}
