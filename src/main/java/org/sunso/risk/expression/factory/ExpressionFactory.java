package org.sunso.risk.expression.factory;

import org.sunso.risk.expression.Expression;

public interface ExpressionFactory {
    Expression getExpression(String expressionKey);
}
