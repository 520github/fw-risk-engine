package org.sunso.risk.rule;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.expression.Expression;
import org.sunso.risk.relation.Relation;

public interface RuleCondition {

    RuleCondition setDataIndicator(DataIndicator dataIndicator);

    DataIndicator getDataIndicator();

    RuleCondition setExpression(Expression expression);

    Expression getExpression();

    RuleCondition setRelation(Relation relation);

    Relation getRelation();

    RuleCondition setTargetValue(String targetValue);

    String getTargetValue();
}
