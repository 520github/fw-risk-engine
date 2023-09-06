package org.sunso.risk.action;

import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;

public class RuleHitDeviceBlackListAction extends AbstractRuleHitAction {
    @Override
    public void doAction(Rule rule, StrategyRequest request, RuleExecuteResponse response) {
        System.out.println("规则["+rule.getRuleName()+"]已命中，把设备["+getDeviceId(request)+"]加入到黑名单");
    }
}
