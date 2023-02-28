package org.sunso.risk.executer;

import org.sunso.risk.context.Context;
import org.sunso.risk.dispatcher.Dispatcher;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.handler.DefaultRuleHandler;
import org.sunso.risk.strategy.Strategy;

public class SimpleSequenceExecuter implements Executer {

    public static SimpleSequenceExecuter create() {
        return new SimpleSequenceExecuter();
    }

    @Override
    public StrategyExecuteResponse execute(StrategyRequest request) {
        return request.getDispatcher().dispatcher(request);
    }
}
