package org.sunso.risk.expression;

import java.math.BigDecimal;

public abstract class AbstractExpression implements Expression {

    /**
     * 转化成BigDecimal
     * @param value
     * @return
     */
    protected BigDecimal getBigDecimal(String value) {
        return new BigDecimal(value);
    }

    /**
     * 判断不为空，同时是数字类型
     * @param targetValue
     * @param dataIndicatorValue
     * @return
     */
    protected boolean checkNullAndBigDecimalReturnFalse(String targetValue, String dataIndicatorValue) {
        return checkNullReturnFalse(targetValue, dataIndicatorValue) && checkBigDecimalReturnFalse(targetValue, dataIndicatorValue);
    }

    /**
     * 判断不为空
     * @param targetValue
     * @param dataIndicatorValue
     * @return
     */
    protected boolean checkNullReturnFalse(String targetValue, String dataIndicatorValue) {
        if (targetValue == null || dataIndicatorValue == null) {
            return false;
        }
        return true;
    }

    /**
     * 判断是数字类型
     * @param targetValue
     * @param dataIndicatorValue
     * @return
     */
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
