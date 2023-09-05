package org.sunso.risk.rule.handler;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

/**
 * 规则命中处理器
 * @param <B>
 */
public interface RuleHitHandler<B extends RuleExecuteResponse> {
    void handle(Rule rule, StrategyRequest request, B response);
}
