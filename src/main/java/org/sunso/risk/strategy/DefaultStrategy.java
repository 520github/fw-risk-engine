package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

public class DefaultStrategy implements Strategy {

    private List<RuleSet> ruleSetList;

    public static DefaultStrategy create() {
        return new DefaultStrategy();
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
