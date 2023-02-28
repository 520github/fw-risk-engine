package org.sunso.risk.expression;

public interface Expression {

    Expression setExpressionName(String expressionName);

    String getExpressionName();

    boolean compare(String targetValue, String dataIndicatorValue);
}
