package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

/**
 * 风控策略定义
 */
public interface Strategy {

    Strategy setRuleSetList(List<RuleSet> ruleSetList);

    List<RuleSet> getRuleSetList();
}
