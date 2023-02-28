package org.sunso.risk.convert;

import org.sunso.risk.entity.DemoRuleConditionEntity;
import org.sunso.risk.entity.DemoRuleEntity;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.DefaultRule;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleCondition;

import java.util.ArrayList;
import java.util.List;

public class DemoRuleConvert implements RuleConvert<DemoRuleEntity> {

    public static DemoRuleConvert getInstance() {
        return DemoRuleConvertHolder.INSTANCE;
    }

    @Override
    public Rule convert(DemoRuleEntity demoRuleEntity, ExpressionFactory expressionFactory,
            RelationFactory relationFactory) {
        List<RuleCondition> ruleConditionList = new ArrayList<>();
        for (DemoRuleConditionEntity ruleCondition : demoRuleEntity.getRuleConditionEntityList()) {
            ruleConditionList.add(
                    DemoRuleConditionConvert.getInstance().convert(ruleCondition, expressionFactory, relationFactory));
        }
        return DefaultRule.create().setRuleConditionList(ruleConditionList);
    }

    private static class DemoRuleConvertHolder {
        private static final DemoRuleConvert INSTANCE = new DemoRuleConvert();
    }
}
