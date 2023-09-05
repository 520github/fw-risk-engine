package org.sunso.risk.expression;

import java.math.BigDecimal;

public abstract class AbstractExpression implements Expression {

    protected BigDecimal getBigDecimal(String value) {
        return new BigDecimal(value);
    }

    protected boolean checkNullAndBigDecimalReturnFalse(String targetValue, String dataIndicatorValue) {
        return checkNullReturnFalse(targetValue, dataIndicatorValue) && checkBigDecimalReturnFalse(targetValue, dataIndicatorValue);
    }
    protected boolean checkNullReturnFalse(String targetValue, String dataIndicatorValue) {
        if (targetValue == null || dataIndicatorValue == null) {
            return false;
        }
        return true;
    }

    protected boolean checkBigDecimalReturnFalse(String targetValue, String dataIndicatorValue) {
        BigDecimal.valueOf(0);
        try {
            new BigDecimal(targetValue);
            new BigDecimal(dataIndicatorValue);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
