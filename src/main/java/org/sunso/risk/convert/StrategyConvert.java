package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.strategy.Strategy;

/**
 * 风控策略转化器
 * 从其它业务对象抽取风控策略相关数据
 * @param <B>
 */
public interface StrategyConvert<B> {

    Strategy convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
