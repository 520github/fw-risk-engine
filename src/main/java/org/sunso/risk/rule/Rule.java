package org.sunso.risk.rule;

import java.util.List;

public interface Rule {

    Rule setHitStrategy(String hitStrategy);

    Rule setRuleConditionList(List<RuleCondition> ruleConditionList);

    List<RuleCondition> getRuleConditionList();
}
