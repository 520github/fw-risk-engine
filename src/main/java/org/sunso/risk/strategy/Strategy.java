package org.sunso.risk.strategy;

import org.sunso.risk.rule.RuleSet;

import java.util.List;

/**
 * 风控策略定义
 */
public interface Strategy {

    /**
     * 设置策略名称
     * @param strategyName
     * @return
     */
    Strategy setStrategyName(String strategyName);

    /**
     * 获取策略名称
     * @return
     */
    String getStrategyName();

    /**
     * 设置规则集列表
     * @param ruleSetList
     * @return
     */
    Strategy setRuleSetList(List<RuleSet> ruleSetList);

    /**
     * 获取规则集列表
     * @return
     */
    List<RuleSet> getRuleSetList();
}
