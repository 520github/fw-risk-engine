package org.sunso.risk.rule;

import java.util.List;

public class DefaultRuleSet implements RuleSet {
    private List<Rule> ruleList;

    public static DefaultRuleSet create() {
        return new DefaultRuleSet();
    }

    @Override
    public RuleSet setRuleList(List<Rule> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    @Override
    public List<Rule> getRuleList() {
        return ruleList;
    }
}
