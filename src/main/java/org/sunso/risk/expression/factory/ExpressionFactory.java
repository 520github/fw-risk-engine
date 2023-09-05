package org.sunso.risk.expression.factory;

import org.sunso.risk.expression.Expression;

/**
 * 规则条件表达式工厂
 */
public interface ExpressionFactory {

    /**
     * 根据表达式key获取对应的表达式对象
     * @param expressionKey
     * @return
     */
    Expression getExpression(String expressionKey);
}
