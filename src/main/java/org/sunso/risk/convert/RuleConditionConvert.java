package org.sunso.risk.convert;

import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.RuleCondition;

/**
 * 规则条件转化器
 * 从其它业务对象抽取规则条件相关数据
 * @param <B>
 */
public interface RuleConditionConvert<B> {
    RuleCondition convert(B b, ExpressionFactory expressionFactory, RelationFactory relationFactory);
}
