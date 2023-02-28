package org.sunso.risk.convert;

import org.sunso.risk.entity.DemoRuleEntity;
import org.sunso.risk.entity.DemoRuleSetEntity;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.DefaultRuleSet;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleSet;

import java.util.ArrayList;
import java.util.List;

public class DemoRuleSetConvert implements RuleSetConvert<DemoRuleSetEntity> {

    public static DemoRuleSetConvert getInstance() {
        return DemoRuleSetConvertHolder.INSTANCE;
    }

    @Override
    public RuleSet convert(DemoRuleSetEntity demoRuleSetEntity, ExpressionFactory expressionFactory,
            RelationFactory relationFactory) {
        List<Rule> ruleList = new ArrayList<>();
        for (DemoRuleEntity ruleEntity : demoRuleSetEntity.getRuleEntityList()) {
            ruleList.add(DemoRuleConvert.getInstance().convert(ruleEntity, expressionFactory, relationFactory));
        }
        return DefaultRuleSet.create().setRuleList(ruleList);
    }

    private static class DemoRuleSetConvertHolder {
        private static final DemoRuleSetConvert INSTANCE = new DemoRuleSetConvert();
    }
}
