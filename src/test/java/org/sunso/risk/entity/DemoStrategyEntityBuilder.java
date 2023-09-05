package org.sunso.risk.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStrategyEntityBuilder {

    public static DemoStrategyEntityBuilder create() {
        return new DemoStrategyEntityBuilder();
    }

    /**
     * 定义风控策略
     * @return
     */
    public DemoStrategyEntity newDemoStrategyEntity() {
        DemoStrategyEntity strategyEntity = new DemoStrategyEntity();
        strategyEntity.setStrategyKey("test");
        strategyEntity.setRuleSetEntityList(Arrays.asList(newDemoRuleSetEntityOne(), newDemoRuleSetEntityTwo()));
        return strategyEntity;
    }

    /**
     * 定义规则集
     * @return
     */
    private DemoRuleSetEntity newDemoRuleSetEntityTwo() {
        DemoRuleSetEntity ruleSetEntity = new DemoRuleSetEntity();
        ruleSetEntity.setRuleSetKey(getRuleSetTwo());
        ruleSetEntity.setRuleEntityList(Arrays.asList(newDemoRuleEntityTwo()));
        return ruleSetEntity;
    }

    /**
     * 定义规则集
     * @return
     */
    private DemoRuleSetEntity newDemoRuleSetEntityOne() {
        DemoRuleSetEntity ruleSetEntity = new DemoRuleSetEntity();
        ruleSetEntity.setRuleSetKey(getRuleSetOne());
        ruleSetEntity.setRuleEntityList(Arrays.asList(newDemoRuleEntityOne()));
        return ruleSetEntity;
    }

    private DemoRuleEntity newDemoRuleEntityOne() {
        DemoRuleEntity demoRuleEntity = new DemoRuleEntity();
        demoRuleEntity.setRuleKey(getRuleKeyOne());
        demoRuleEntity.setRuleSetKey(getRuleSetOne());
        List<DemoRuleConditionEntity> ruleConditionEntityList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ruleConditionEntityList.add(newRuleOneDemoRuleConditionOne("indicatorOne" + i, "数据指标one" + i, "one" + i));
        }
        demoRuleEntity.setRuleConditionEntityList(ruleConditionEntityList);
        return demoRuleEntity;
    }

    private DemoRuleEntity newDemoRuleEntityTwo() {
        DemoRuleEntity demoRuleEntity = new DemoRuleEntity();
        demoRuleEntity.setRuleKey(getRuleKeyTwo());
        demoRuleEntity.setRuleSetKey(getRuleSetTwo());
        List<DemoRuleConditionEntity> ruleConditionEntityList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ruleConditionEntityList.add(newRuleOneDemoRuleConditionTwo("indicatorTwo" + i, "数据指标two" + i, "two" + i));
        }
        demoRuleEntity.setRuleConditionEntityList(ruleConditionEntityList);
        return demoRuleEntity;
    }

    private DemoRuleConditionEntity newRuleOneDemoRuleConditionOne(String dataIndicatorKey, String dataIndicatorName,
            String targetValue) {
        return newDemoRuleConditionEntity(getRuleKeyOne(), dataIndicatorKey, dataIndicatorName,
                getDataIndicatorInvokerKeyOne(), getDataSourceKeyOne(), getEqualExpressionKey(), getAndRelationKey(),
                targetValue);
    }

    private DemoRuleConditionEntity newRuleOneDemoRuleConditionTwo(String dataIndicatorKey, String dataIndicatorName,
            String targetValue) {
        return newDemoRuleConditionEntity(getRuleKeyTwo(), dataIndicatorKey, dataIndicatorName,
                getDataIndicatorInvokerKeyTwo(), getDataIndicatorInvokerKeyOne(), getNotEqualExpressionKey(),
                getAndRelationKey(), targetValue);
    }

    private DemoRuleConditionEntity newDemoRuleConditionEntity(String ruleKey, String dataIndicatorKey,
            String dataIndicatorName, String dataIndicatorInvokerKey, String dataSourceKey, String expressionKey,
            String relationKey, String targetValue) {
        DemoRuleConditionEntity instance = new DemoRuleConditionEntity();
        instance.setRuleKey(ruleKey);
        instance.setDataIndicatorKey(dataIndicatorKey);
        instance.setDataIndicatorName(dataIndicatorName);
        instance.setDataIndicatorInvokeKey(dataIndicatorInvokerKey);
        instance.setDataSourceKey(dataSourceKey);
        instance.setExpressionKey(expressionKey);
        instance.setRelationKey(relationKey);
        instance.setTargetValue(targetValue);
        return instance;
    }

    private String getRuleSetTwo() {
        return "ruleSetTwo";
    }

    private String getRuleSetOne() {
        return "ruleSetOne";
    }

    private String getRuleKeyOne() {
        return "ruleKeyOne";
    }

    private String getRuleKeyTwo() {
        return "ruleKeyTwo";
    }

    private String getDataSourceKeyOne() {
        return "dataSourceKeyOne";
    }

    private String getDataSourceKeyTwo() {
        return "dataSourceKeyTwo";
    }

    private String getDataIndicatorInvokerKeyOne() {
        return "dataIndicatorInvokerKeyOne";
    }

    private String getDataIndicatorInvokerKeyTwo() {
        return "dataIndicatorInvokerKeyTwo";
    }

    private String getAndRelationKey() {
        return "and";
    }

    private String getEqualExpressionKey() {
        return "equal";
    }

    private String getNotEqualExpressionKey() {
        return "notEqual";
    }

}
