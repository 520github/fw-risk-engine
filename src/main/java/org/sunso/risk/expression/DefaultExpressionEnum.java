package org.sunso.risk.expression;

/**
 * 默认表达式枚举
 */
public enum DefaultExpressionEnum {
    equal("equal", "等于", new EqualExpression()),
    notEqual("notEqual", "不等于", new NotEqualExpression()),
    less("less", "小于", new LessExpression()),
    greater("greater", "大于", new GreaterExpression()),
    lessAndEqual("lessAndEqual", "小于等于", new LessAndEqualExpression()),
    greaterAndEqual("greaterAndEqual", "大于等于", new GreaterAndEqualExpression()),
    contains("contains", "包含", new ContainsExpression()),
    notContains("notContains", "不包含", new NotContainsExpression()),
    ;

    String expressionKey;
    String expressionName;
    Expression expression;

    DefaultExpressionEnum(String expressionKey, String expressionName, Expression expression) {
        this.expressionKey = expressionKey;
        this.expressionName = expressionName;
        this.expression = expression;
    }

    public String getExpressionKey() {
        return expressionKey;
    }

    public String getExpressionName() {
        return expressionName;
    }

    public Expression getExpression() {
        if (expression.getExpressionName() == null) {
            expression.setExpressionName(expressionName);
        }
        return expression;
    }

    public static Expression getExpressionByExpressionKey(String expressionKey) {
        for (DefaultExpressionEnum expressionEnum : values()) {
            if (expressionEnum.expressionKey.equals(expressionKey)) {
                return expressionEnum.getExpression().setExpressionName(expressionEnum.expressionName);
            }
        }
        return null;
    }
}
