package org.sunso.risk.entity;

import java.util.List;

public class DemoRuleEntity {
    private Long id;
    private String ruleKey;
    private String ruleName;
    private String ruleSetKey;
    private List<DemoRuleConditionEntity> ruleConditionEntityList;

    public Long getId() {
        return id;
    }

    public DemoRuleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public DemoRuleEntity setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public DemoRuleEntity setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleSetKey() {
        return ruleSetKey;
    }

    public DemoRuleEntity setRuleSetKey(String ruleSetKey) {
        this.ruleSetKey = ruleSetKey;
        return this;
    }

    public List<DemoRuleConditionEntity> getRuleConditionEntityList() {
        return ruleConditionEntityList;
    }

    public DemoRuleEntity setRuleConditionEntityList(List<DemoRuleConditionEntity> ruleConditionEntityList) {
        this.ruleConditionEntityList = ruleConditionEntityList;
        return this;
    }
}
