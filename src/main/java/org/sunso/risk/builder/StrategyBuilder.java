package org.sunso.risk.builder;

import org.sunso.risk.rule.RuleSet;
import org.sunso.risk.strategy.DefaultStrategy;
import org.sunso.risk.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyBuilder {

    private List<RuleSet> ruleSetList = new ArrayList<>();
    private String strategyName;

    public static StrategyBuilder create() {
        return new StrategyBuilder();
    }

    public StrategyBuilder strategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    public StrategyBuilder ruleSet(RuleSet ruleSet) {
        ruleSetList.add(ruleSet);
        return this;
    }

    public Strategy build() {
        return DefaultStrategy.create()
                .setStrategyName(strategyName)
                .setRuleSetList(ruleSetList);
    }
}
