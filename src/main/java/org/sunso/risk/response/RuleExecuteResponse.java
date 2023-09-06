package org.sunso.risk.response;

import org.sunso.risk.rule.Rule;

/**
 * 规则执行结果
 */
public class RuleExecuteResponse {
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 规则是否命中
     */
    private boolean isHit;
    /**
     * 规则命中得分
     */
    private int hitScore;

    /**
     * 规则执行详情
     */
    private String ruleExecuteDetail;

    public RuleExecuteResponse(Rule rule) {
        this.ruleName = rule.getRuleName();
    }

    public static RuleExecuteResponse create(Rule rule) {
        return new RuleExecuteResponse(rule);
    }

    public String getRuleName() {
        return ruleName;
    }

    public RuleExecuteResponse setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public boolean isHit() {
        return isHit;
    }

    public RuleExecuteResponse setHit(boolean hit) {
        isHit = hit;
        return this;
    }

    public int getHitScore() {
        return hitScore;
    }

    public RuleExecuteResponse setHitScore(int hitScore) {
        this.hitScore = hitScore;
        return this;
    }

    public String getRuleExecuteDetail() {
        return ruleExecuteDetail;
    }

    public RuleExecuteResponse setRuleExecuteDetail(String ruleExecuteDetail) {
        this.ruleExecuteDetail = ruleExecuteDetail;
        return this;
    }
}
