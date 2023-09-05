package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

/**
 * 默认风控策略
 */
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
