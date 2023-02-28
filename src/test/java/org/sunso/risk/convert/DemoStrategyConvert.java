package org.sunso.risk.convert;

import org.sunso.risk.entity.DemoRuleSetEntity;
import org.sunso.risk.entity.DemoStrategyEntity;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.RuleSet;
import org.sunso.risk.strategy.DefaultStrategy;
import org.sunso.risk.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class DemoStrategyConvert implements StrategyConvert<DemoStrategyEntity> {

    public static DemoStrategyConvert getInstance() {
        return DemoStrategyConvertHolder.INSTANCE;
    }

    @Override
    public Strategy convert(DemoStrategyEntity demoStrategyEntity, ExpressionFactory expressionFactory,
            RelationFactory relationFactory) {
        List<RuleSet> ruleSetList = new ArrayList<>();
        for (DemoRuleSetEntity ruleSetEntity : demoStrategyEntity.getRuleSetEntityList()) {
            ruleSetList
                    .add(DemoRuleSetConvert.getInstance().convert(ruleSetEntity, expressionFactory, relationFactory));
        }
        return DefaultStrategy.create().setRuleSetList(ruleSetList);
    }

    private static class DemoStrategyConvertHolder {
        private static final DemoStrategyConvert INSTANCE = new DemoStrategyConvert();
    }
}
