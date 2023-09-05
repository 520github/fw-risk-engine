package org.sunso.risk.rule.join;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;

/**
 * 规则条件之间的关系连接点
 */
public interface RelationJoin {

    boolean join(StrategyRequest request, RuleConditionExecuteResponse ruleConditionExecuteResponse);
}
