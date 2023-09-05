package org.sunso.risk.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 规则策略执行结果
 */
public class StrategyExecuteResponse {
    /**
     * 命中规则数
     */
    private int hitRuleNum;
    /**
     * 命中规则集数s
     */
    private int hitRuleSetNum;

    /**
     * 规则集执行结果
     */
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
