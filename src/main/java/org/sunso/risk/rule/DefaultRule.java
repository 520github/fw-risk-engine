package org.sunso.risk.rule;

import java.util.List;

/**
 * 默认规则定义
 */
public class DefaultRule implements Rule {
    /**
     * 规则名称
     */
    private String ruleName;
    private List<RuleCondition> ruleConditionList;

    public static DefaultRule create() {
        return new DefaultRule();
    }

    @Override
    public Rule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    @Override
    public String getRuleName() {
        return ruleName;
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
