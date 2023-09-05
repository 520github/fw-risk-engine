package org.sunso.risk.executer;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;

/**
 * 风控策略执行器
 */
public interface Executer {
    StrategyExecuteResponse execute(StrategyRequest request);
}
