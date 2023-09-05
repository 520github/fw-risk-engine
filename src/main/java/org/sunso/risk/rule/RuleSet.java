package org.sunso.risk.rule;

import java.util.List;

/**
 * 规则集定义
 */
public interface RuleSet {

    /**
     * 设置规则集名称
     * @param ruleSetName
     * @return
     */
    RuleSet setRuleSetName(String ruleSetName);

    /**
     * 获取规则集名称
     * @return
     */
    String getRuleSetName();

    /**
     * 设置规则列表
     * @param ruleList
     * @return
     */
    RuleSet setRuleList(List<Rule> ruleList);

    /**
     * 获取规则列表
     * @return
     */
    List<Rule> getRuleList();
}
