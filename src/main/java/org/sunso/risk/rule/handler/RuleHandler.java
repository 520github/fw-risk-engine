package org.sunso.risk.rule.handler;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

public interface RuleHandler {
    RuleExecuteResponse handle(Rule rule, StrategyRequest request);
}
