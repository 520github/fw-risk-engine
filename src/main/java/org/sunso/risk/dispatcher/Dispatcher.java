package org.sunso.risk.dispatcher;

import org.sunso.risk.context.Context;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.handler.RuleHandler;
import org.sunso.risk.strategy.Strategy;

/**
 * 规则集执行分发器
 * 1、可以顺序执行规则集
 * 2、可以并发多任务执行规则集
 */
public interface Dispatcher {
    StrategyExecuteResponse dispatcher(StrategyRequest request);
}
