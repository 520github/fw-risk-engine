package org.sunso.risk.expression;

import java.util.List;

/**
 * 不包含表达式
 */
public class NotContainsExpression extends AbstractExpression {
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
        if (checkNullReturnFalse(targetValue, dataIndicatorValue)) {
            String[] targetList = targetValue.split(",");
            for(String target: targetList) {
                if (target.equalsIgnoreCase(dataIndicatorValue)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
