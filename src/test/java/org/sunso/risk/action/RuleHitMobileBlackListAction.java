package org.sunso.risk.action;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

public class RuleHitMobileBlackListAction implements RuleHitAction {
    @Override
    public void doAction(Rule rule, StrategyRequest request, RuleExecuteResponse response) {
        System.out.println("规则["+rule.getRuleName()+"]已命中，把手机号加入到黑名单");
    }
}
