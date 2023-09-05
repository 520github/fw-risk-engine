package org.sunso.risk.builder;

import org.sunso.risk.rule.DefaultRule;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleCondition;

import java.util.ArrayList;
import java.util.List;

public class RuleBuilder {

    private String ruleName;

    private List<RuleCondition> ruleConditionList = new ArrayList<>();

    public static RuleBuilder create() {
        return new RuleBuilder();
    }

    public RuleBuilder ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public RuleBuilder ruleCondition(RuleCondition ruleCondition) {
        ruleConditionList.add(ruleCondition);
        return this;
    }

    public Rule build() {
        return DefaultRule.create()
                .setRuleName(ruleName)
                .setRuleConditionList(ruleConditionList);
    }
}
