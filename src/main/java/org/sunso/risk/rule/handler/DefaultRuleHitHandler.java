package org.sunso.risk.rule.handler;

import org.sunso.risk.action.RuleHitAction;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

public class DefaultRuleHitHandler implements RuleHitHandler<RuleExecuteResponse> {

    public static DefaultRuleHitHandler create() {
        return new DefaultRuleHitHandler();
    }

    @Override
    public void handle(Rule rule, StrategyRequest request, RuleExecuteResponse response) {
        if (rule.getRuleHitActionList() == null) {
            return ;
        }
        for (RuleHitAction action: rule.getRuleHitActionList()) {
            action.doAction(rule, request, response);
        }
    }
}
