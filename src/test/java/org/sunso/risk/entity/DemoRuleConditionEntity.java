package org.sunso.risk.entity;

public class DemoRuleConditionEntity {
    private Long id;
    private Long ruleId;
    private String ruleKey;
    private String relationKey;
    private String dataIndicatorKey;
    private String dataIndicatorName;
    private String dataIndicatorInvokeKey;
    private String dataSourceKey;
    private String targetValue;
    private String expressionKey;

    public Long getId() {
        return id;
    }

    public DemoRuleConditionEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public DemoRuleConditionEntity setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public DemoRuleConditionEntity setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
        return this;
    }

    public String getRelationKey() {
        return relationKey;
    }

    public DemoRuleConditionEntity setRelationKey(String relationKey) {
        this.relationKey = relationKey;
        return this;
    }

    public String getDataIndicatorKey() {
        return dataIndicatorKey;
    }

    public DemoRuleConditionEntity setDataIndicatorKey(String dataIndicatorKey) {
        this.dataIndicatorKey = dataIndicatorKey;
        return this;
    }

    public String getDataIndicatorName() {
        return dataIndicatorName;
    }

    public DemoRuleConditionEntity setDataIndicatorName(String dataIndicatorName) {
        this.dataIndicatorName = dataIndicatorName;
        return this;
    }

    public String getDataIndicatorInvokeKey() {
        return dataIndicatorInvokeKey;
    }

    public DemoRuleConditionEntity setDataIndicatorInvokeKey(String dataIndicatorInvokeKey) {
        this.dataIndicatorInvokeKey = dataIndicatorInvokeKey;
        return this;
    }

    public String getDataSourceKey() {
        return dataSourceKey;
    }

    public DemoRuleConditionEntity setDataSourceKey(String dataSourceKey) {
        this.dataSourceKey = dataSourceKey;
        return this;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public DemoRuleConditionEntity setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    public String getExpressionKey() {
        return expressionKey;
    }

    public DemoRuleConditionEntity setExpressionKey(String expressionKey) {
        this.expressionKey = expressionKey;
        return this;
    }
}
