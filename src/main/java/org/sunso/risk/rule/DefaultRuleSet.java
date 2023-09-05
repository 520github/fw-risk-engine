package org.sunso.risk.rule;

import java.util.List;

/**
 * 默认规则集定义
 */
public class DefaultRuleSet implements RuleSet {
    /**
     * 规则集名称
     */
    private String ruleSetName;
    /**
     * 规则集列表
     */
    private List<Rule> ruleList;

    public static DefaultRuleSet create() {
        return new DefaultRuleSet();
    }

    @Override
    public RuleSet setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    @Override
    public String getRuleSetName() {
        return ruleSetName;
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
