package org.sunso.risk.executer;

import org.sunso.risk.context.Context;
import org.sunso.risk.dispatcher.Dispatcher;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.strategy.Strategy;

/**
 * 风控策略执行器
 */
public interface Executer {
    StrategyExecuteResponse execute(StrategyRequest request);
}
