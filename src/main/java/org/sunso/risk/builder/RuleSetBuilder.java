package org.sunso.risk.builder;

import org.sunso.risk.rule.DefaultRuleSet;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleSet;

import java.util.ArrayList;
import java.util.List;

public class RuleSetBuilder {

    private String ruleSetName;

    private List<Rule> ruleList = new ArrayList<>();

    public static RuleSetBuilder create() {
        return new RuleSetBuilder();
    }

    public RuleSetBuilder ruleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    public RuleSetBuilder rule(Rule rule) {
        ruleList.add(rule);
        return this;
    }

    public RuleSet build() {
        return DefaultRuleSet.create()
                .setRuleSetName(ruleSetName)
                .setRuleList(ruleList);

    }
}
