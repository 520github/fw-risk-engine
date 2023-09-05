package org.sunso.risk.executer;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;

/**
 * 简单顺序执行器
 */
public class SimpleSequenceExecuter implements Executer {

    public static SimpleSequenceExecuter create() {
        return new SimpleSequenceExecuter();
    }

    @Override
    public StrategyExecuteResponse execute(StrategyRequest request) {
        return request.getDispatcher().dispatcher(request);
    }
}
