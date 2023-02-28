package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.strategy.Strategy;

public interface StrategyConvert<B> {

    Strategy convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
