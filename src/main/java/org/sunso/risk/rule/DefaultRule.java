package org.sunso.risk.rule;

import java.util.List;

/**
 * 默认规则定义
 */
public class DefaultRule implements Rule {
    private List<RuleCondition> ruleConditionList;

    public static DefaultRule create() {
        return new DefaultRule();
    }

    @Override
    public Rule setHitStrategy(String hitStrategy) {
        return null;
    }

    @Override
    public Rule setRuleConditionList(List<RuleCondition> ruleConditionList) {
        this.ruleConditionList = ruleConditionList;
        return this;
    }

    @Override
    public List<RuleCondition> getRuleConditionList() {
        return ruleConditionList;
    }
}
