package org.sunso.risk.rule;

import java.util.List;

public interface RuleSet {

    RuleSet setRuleList(List<Rule> ruleList);

    List<Rule> getRuleList();
}
