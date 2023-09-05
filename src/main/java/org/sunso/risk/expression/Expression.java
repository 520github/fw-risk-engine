package org.sunso.risk.expression;

/**
 * 规则条件表达式
 * 如： 等于、不等于、大于、小于、包含、不包含等
 *
 */
public interface Expression {

    Expression setExpressionName(String expressionName);

    String getExpressionName();

    boolean compare(String targetValue, String dataIndicatorValue);
}
