package org.sunso.risk.response;

public class RuleExecuteResponse {
    private boolean isHit;
    private int hitScore;

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
