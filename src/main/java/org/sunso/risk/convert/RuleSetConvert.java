package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.RuleSet;

/**
 * 规则集转化器
 * 从其它业务对象抽取规则集相关数据
 * @param <B>
 */
public interface RuleSetConvert<B> {
    RuleSet convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
