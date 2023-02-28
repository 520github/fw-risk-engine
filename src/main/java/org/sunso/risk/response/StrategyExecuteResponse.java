package org.sunso.risk.response;

import java.util.ArrayList;
import java.util.List;

public class StrategyExecuteResponse {
    private int hitRuleNum;
    private int hitRuleSetNum;
    List<RuleSetExecuteResponse> ruleSetExecuteResponseList = new ArrayList<>();

    public static StrategyExecuteResponse create() {
        return new StrategyExecuteResponse();
    }

    public int getHitRuleNum() {
        return hitRuleNum;
    }

    public StrategyExecuteResponse setHitRuleNum(int hitRuleNum) {
        this.hitRuleNum = hitRuleNum;
        return this;
    }

    public int getHitRuleSetNum() {
        return hitRuleSetNum;
    }

    public StrategyExecuteResponse setHitRuleSetNum(int hitRuleSetNum) {
        this.hitRuleSetNum = hitRuleSetNum;
        return this;
    }

    public List<RuleSetExecuteResponse> getRuleSetExecuteResponseList() {
        return ruleSetExecuteResponseList;
    }

    public StrategyExecuteResponse setRuleSetExecuteResponseList(
            List<RuleSetExecuteResponse> ruleSetExecuteResponseList) {
        this.ruleSetExecuteResponseList = ruleSetExecuteResponseList;
        return this;
    }

    public void addRuleSetExecuteResponse(RuleSetExecuteResponse ruleSetExecuteResponse) {
        ruleSetExecuteResponseList.add(ruleSetExecuteResponse);
        if (ruleSetExecuteResponse.isHit()) {
            this.hitRuleSetNum++;
            this.hitRuleNum += ruleSetExecuteResponse.getHitRuleNum();
        }
    }
}
