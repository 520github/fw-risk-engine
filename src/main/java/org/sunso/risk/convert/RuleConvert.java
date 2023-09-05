package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.Rule;

/**
 * 规则转化器
 * 从其它业务对象抽取规则相关数据
 * @param <B>
 */
public interface RuleConvert<B> {
    Rule convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
