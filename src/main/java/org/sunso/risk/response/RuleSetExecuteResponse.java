package org.sunso.risk.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 规则集执行结果
 */
public class RuleSetExecuteResponse {
    /**
     * 规则集是否命中
     */
    private boolean isHit;
    /**
     * 命中规则数
     */
    private int hitRuleNum;
    /**
     * 规则执行结果列表
     */
    private List<RuleExecuteResponse> ruleExecuteResponseList = new ArrayList<>();

    public static RuleSetExecuteResponse create() {
        return new RuleSetExecuteResponse();
    }

    public boolean isHit() {
        return isHit;
    }

    public RuleSetExecuteResponse setHit(boolean hit) {
        isHit = hit;
        return this;
    }

    public int getHitRuleNum() {
        return hitRuleNum;
    }

    public RuleSetExecuteResponse setHitRuleNum(int hitRuleNum) {
        this.hitRuleNum = hitRuleNum;
        return this;
    }

    public List<RuleExecuteResponse> getRuleExecuteResponseList() {
        return ruleExecuteResponseList;
    }

    public RuleSetExecuteResponse setRuleExecuteResponseList(List<RuleExecuteResponse> ruleExecuteResponseList) {
        this.ruleExecuteResponseList = ruleExecuteResponseList;
        return this;
    }

    public void addRuleExecuteResponse(RuleExecuteResponse ruleExecuteResponse) {
        ruleExecuteResponseList.add(ruleExecuteResponse);
        if (ruleExecuteResponse.isHit()) {
            if (hitRuleNum == 0) {
                isHit = true;
            }
            hitRuleNum++;
        }
    }
}
