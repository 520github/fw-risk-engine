package org.sunso.risk.rule;

import org.sunso.risk.action.RuleHitAction;

import java.util.List;

/**
 * 规则定义
 */
public interface Rule {

    /**
     * 设置规则名称
     * @param ruleName
     * @return
     */
    Rule setRuleName(String ruleName);

    /**
     * 获取规则名称
     * @return
     */
    String getRuleName();

    /**
     * 设置命中策略
     * @param hitStrategy
     * @return
     */
    Rule setHitStrategy(String hitStrategy);

    /**
     * 设置规则条件列表
     * @param ruleConditionList
     * @return
     */
    Rule setRuleConditionList(List<RuleCondition> ruleConditionList);

    /**
     * 获取规则条件列表
     * @return
     */
    List<RuleCondition> getRuleConditionList();

    /**
     * 设置规则命中执行动作列表
     * @param ruleHitActionList
     * @return
     */
    Rule setRuleHitActionList(List<RuleHitAction> ruleHitActionList);

    /**
     * 获取规则命中执行动作列表
     * @return
     */
    List<RuleHitAction> getRuleHitActionList();
}
