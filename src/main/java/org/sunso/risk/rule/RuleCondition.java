package org.sunso.risk.rule;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.expression.Expression;
import org.sunso.risk.relation.Relation;

/**
 * 规则条件定义
 */
public interface RuleCondition {

    /**
     * 设置规则条件对应的数据指标
     * @param dataIndicator
     * @return
     */
    RuleCondition setDataIndicator(DataIndicator dataIndicator);

    /**
     * 获取数据指标
     * @return
     */
    DataIndicator getDataIndicator();


    /**
     * 设置规则条件表达式
     * @param expression
     * @return
     */
    RuleCondition setExpression(Expression expression);

    /**
     * 获取规则条件表达式
     * @return
     */
    Expression getExpression();

    /**
     * 设置规则条件关系
     * @param relation
     * @return
     */
    RuleCondition setRelation(Relation relation);

    /**
     * 获取规则条件关系
     * @return
     */
    Relation getRelation();

    /**
     * 设置规则条件目标值
     * @param targetValue
     * @return
     */
    RuleCondition setTargetValue(String targetValue);

    /**
     * 获取规则条件目标值
     * @return
     */
    String getTargetValue();
}
