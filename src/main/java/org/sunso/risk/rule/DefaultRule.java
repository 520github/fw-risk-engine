package org.sunso.risk.rule;

import org.sunso.risk.action.RuleHitAction;

import java.util.List;

/**
 * 默认规则定义
 */
public class DefaultRule implements Rule {
    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 规则条件列表
     */
    private List<RuleCondition> ruleConditionList;

    /**
     * 规则命中执行动作列表
     */
    private List<RuleHitAction> ruleHitActionList;

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

    @Override
    public Rule setRuleHitActionList(List<RuleHitAction> ruleHitActionList) {
        this.ruleHitActionList = ruleHitActionList;
        return this;
    }

    @Override
    public List<RuleHitAction> getRuleHitActionList() {
        return ruleHitActionList;
    }
}
