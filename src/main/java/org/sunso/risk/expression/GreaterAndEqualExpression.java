package org.sunso.risk.expression;

/**
 * 大于等于表达式
 */
public class GreaterAndEqualExpression extends AbstractExpression {
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
        if (checkNullAndBigDecimalReturnFalse(targetValue, dataIndicatorValue)) {
            return getBigDecimal(dataIndicatorValue).compareTo(getBigDecimal(targetValue)) >= 0;
        }
        return false;
    }
}
