package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.RuleSet;

public interface RuleSetConvert<B> {
    RuleSet convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
