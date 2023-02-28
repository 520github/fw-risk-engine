package org.sunso.risk.convert;

import org.sunso.risk.entity.DemoRuleConditionEntity;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.DefaultRuleCondition;
import org.sunso.risk.rule.RuleCondition;

public class DemoRuleConditionConvert implements RuleConditionConvert<DemoRuleConditionEntity> {

    public static DemoRuleConditionConvert getInstance() {
        return DemoRuleConditionConvertHolder.INSTANCE;
    }

    @Override
    public RuleCondition convert(DemoRuleConditionEntity demoRuleConditionEntity, ExpressionFactory expressionFactory,
            RelationFactory relationFactory) {
        return DefaultRuleCondition.create()
                .setDataIndicator(DemoDataIndicatorConvert.getInstance().convert(demoRuleConditionEntity))
                .setExpression(expressionFactory.getExpression(demoRuleConditionEntity.getExpressionKey()))
                .setRelation(relationFactory.getRelation(demoRuleConditionEntity.getRelationKey()))
                .setTargetValue(demoRuleConditionEntity.getTargetValue());
    }

    private static class DemoRuleConditionConvertHolder {
        private static final DemoRuleConditionConvert INSTANCE = new DemoRuleConditionConvert();
    }
}
