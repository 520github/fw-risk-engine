package org.sunso.risk.action;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

public interface RuleHitAction extends Action {

    void doAction(Rule rule, StrategyRequest request, RuleExecuteResponse response);
}
