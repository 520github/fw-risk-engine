package org.sunso.risk.expression.factory;

import org.sunso.risk.expression.DefaultExpressionEnum;
import org.sunso.risk.expression.Expression;

public class DefaultExpressionFactory implements ExpressionFactory {
    public static DefaultExpressionFactory create() {
        return new DefaultExpressionFactory();
    }

    @Override
    public Expression getExpression(String expressionKey) {
        return DefaultExpressionEnum.getExpressionByExpressionKey(expressionKey);
    }
}
