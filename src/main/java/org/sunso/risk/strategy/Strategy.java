package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

public interface Strategy {

    Strategy setRuleSetList(List<RuleSet> ruleSetList);

    List<RuleSet> getRuleSetList();
}
