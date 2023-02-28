package org.sunso.risk.dispatcher;

import org.sunso.risk.context.Context;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.handler.RuleHandler;
import org.sunso.risk.strategy.Strategy;

public interface Dispatcher {
    StrategyExecuteResponse dispatcher(StrategyRequest request);
}
