package org.sunso.risk.rule.join;

import org.sunso.risk.context.Context;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;
import org.sunso.risk.rule.RuleCondition;

public interface RelationJoin {

    boolean join(StrategyRequest request, RuleConditionExecuteResponse ruleConditionExecuteResponse);
}
