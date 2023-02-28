package org.sunso.risk.entity;

import java.util.List;

public class DemoRuleSetEntity {
    private Long id;
    private String ruleSetKey;
    private String ruleSetName;
    private List<DemoRuleEntity> ruleEntityList;

    public Long getId() {
        return id;
    }

    public DemoRuleSetEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRuleSetKey() {
        return ruleSetKey;
    }

    public DemoRuleSetEntity setRuleSetKey(String ruleSetKey) {
        this.ruleSetKey = ruleSetKey;
        return this;
    }

    public String getRuleSetName() {
        return ruleSetName;
    }

    public DemoRuleSetEntity setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    public List<DemoRuleEntity> getRuleEntityList() {
        return ruleEntityList;
    }

    public DemoRuleSetEntity setRuleEntityList(List<DemoRuleEntity> ruleEntityList) {
        this.ruleEntityList = ruleEntityList;
        return this;
    }
}
