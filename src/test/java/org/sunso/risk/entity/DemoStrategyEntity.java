package org.sunso.risk.entity;

import java.util.List;

public class DemoStrategyEntity {
    private Long id;
    private String strategyKey;
    private String strategyName;
    private List<DemoRuleSetEntity> ruleSetEntityList;

    public Long getId() {
        return id;
    }

    public DemoStrategyEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStrategyKey() {
        return strategyKey;
    }

    public DemoStrategyEntity setStrategyKey(String strategyKey) {
        this.strategyKey = strategyKey;
        return this;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public DemoStrategyEntity setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    public List<DemoRuleSetEntity> getRuleSetEntityList() {
        return ruleSetEntityList;
    }

    public DemoStrategyEntity setRuleSetEntityList(List<DemoRuleSetEntity> ruleSetEntityList) {
        this.ruleSetEntityList = ruleSetEntityList;
        return this;
    }
}
