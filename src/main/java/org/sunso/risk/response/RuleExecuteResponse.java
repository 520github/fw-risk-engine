package org.sunso.risk.response;

/**
 * 规则执行结果
 */
public class RuleExecuteResponse {
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

    public static RuleExecuteResponse create() {
        return new RuleExecuteResponse();
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
