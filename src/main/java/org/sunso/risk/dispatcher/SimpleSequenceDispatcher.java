package org.sunso.risk.dispatcher;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleSetExecuteResponse;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleSet;

/**
 * 简单顺序执行分发器
 */
public class SimpleSequenceDispatcher implements Dispatcher {

    public static SimpleSequenceDispatcher create() {
        return new SimpleSequenceDispatcher();
    }

    @Override
    public StrategyExecuteResponse dispatcher(StrategyRequest request) {
        StrategyExecuteResponse strategyExecuteResponse = StrategyExecuteResponse.create();
        // 执行风控策略下的所有规则集
        for (RuleSet ruleSet : request.getStrategy().getRuleSetList()) {
            RuleSetExecuteResponse ruleSetExecuteResponse = RuleSetExecuteResponse.create();
            //执行规则集下所有的规则
            for (Rule rule : ruleSet.getRuleList()) {
                ruleSetExecuteResponse.addRuleExecuteResponse(request.getRuleHandler().handle(rule, request));
            }
            strategyExecuteResponse.addRuleSetExecuteResponse(ruleSetExecuteResponse);
        }
        return strategyExecuteResponse;
    }
}
