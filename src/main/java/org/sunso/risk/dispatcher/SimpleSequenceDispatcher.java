package org.sunso.risk.dispatcher;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleSetExecuteResponse;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleSet;

public class SimpleSequenceDispatcher implements Dispatcher {

    public static SimpleSequenceDispatcher create() {
        return new SimpleSequenceDispatcher();
    }

    @Override
    public StrategyExecuteResponse dispatcher(StrategyRequest request) {
        StrategyExecuteResponse strategyExecuteResponse = StrategyExecuteResponse.create();
        for (RuleSet ruleSet : request.getStrategy().getRuleSetList()) {
            RuleSetExecuteResponse ruleSetExecuteResponse = RuleSetExecuteResponse.create();
            for (Rule rule : ruleSet.getRuleList()) {
                ruleSetExecuteResponse.addRuleExecuteResponse(request.getRuleHandler().handle(rule, request));
            }
            strategyExecuteResponse.addRuleSetExecuteResponse(ruleSetExecuteResponse);
        }
        return strategyExecuteResponse;
    }
}
