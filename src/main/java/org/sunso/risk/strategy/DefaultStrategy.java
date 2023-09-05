package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

/**
 * 默认风控策略
 */
public class DefaultStrategy implements Strategy {

    private String strategyName;

    private List<RuleSet> ruleSetList;

    public static DefaultStrategy create() {
        return new DefaultStrategy();
    }

    @Override
    public Strategy setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    @Override
    public String getStrategyName() {
        return strategyName;
    }

    @Override
    public Strategy setRuleSetList(List<RuleSet> ruleSetList) {
        this.ruleSetList = ruleSetList;
        return this;
    }

    @Override
    public List<RuleSet> getRuleSetList() {
        return ruleSetList;
    }
}
