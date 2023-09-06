独立、可扩展、高性能的风控引擎框架
======================

#### 前言
* 层级概念分明、职责明确、易于快速介入。
* 不依赖任何第三方工具。
* 可支持各种场景的风控规则引擎。
* 可灵活对各个节点进行扩展。
* 数据源及数据指标进行统一管理及路由。
* 数据指标计算和规则执行可实现异步联动。
* 占用内存小。


#### 概念说明

| 概念             | 说明             | 接口                                               |
|----------------|----------------|--------------------------------------------------|
| Strategy          | 风控策略，由多个规则集组合  | org.sunso.risk.strategy.Strategy                 |
| RuleSet          | 规则集，由多个规则组成    | org.sunso.risk.rule.RuleSet                      |
| Rule          | 规则，由多个规则条件组成   | org.sunso.risk.rule.Rule                         |
| RuleCondition        | 规则条件，由多个数据指标组成 | org.sunso.risk.rule.RuleCondition                |
| DataIndicator         | 数据指标           | org.sunso.risk.data.indicator.DataIndicator      |
| DataSource       | 数据源            | org.sunso.risk.data.source.DataSource            |
| DataIndicatorRoute         | 数据指标路由器        | org.sunso.risk.data.indicator.DataIndicatorRoute |
| DataSourceRoute       | 数据源路由器         | org.sunso.risk.data.source.DataSourceRoute       |
| DataType   | 数据类型           | org.sunso.risk.data.type.DataType                |
| Action | 规则命中动作         | org.sunso.risk.action.Action                     |
| Expression        | 规则条件的表达式       | org.sunso.risk.expression.Expression                       |
| Relation       | 规则条件之间的关系      | org.sunso.risk.relation.Relation                 |
| RelationJoin        | 关系连接点          | org.sunso.risk.rule.join.RelationJoin            |
| RuleHandler       | 规则处理器          | org.sunso.risk.rule.handler.RuleHandler          |
| RuleHitHandler        | 规则命中处理器        | org.sunso.risk.rule.handler.RuleHitHandler       |
| Dispatcher      | 不同类型分发器        | org.sunso.risk.dispatcher.Dispatcher             |
| Executer     | 风控策略执行器        | org.sunso.risk.executer.Executer                 |
| Context     | 业务上下文          | org.sunso.risk.context.Context                   |


#### demo (具体可以参考源码中的单元测试)
~~~
        //一级                                   风控策略(整体层级结构)
        //二级                         规则集1                         规则集2                规则集3
        //三级       规则11             规则12      规则13         规则21     规则22            规则31
        //四级 规则条件111 规则条件112    规则条件121                规则条件211                  规则条件311
        //五级 数据指标111 数据指标112    数据指标121                数据指标211                  数据指标311
        //六级 数据源111   数据源112      数据源121                 数据源211                    数据源311

        StrategyBuilder strategyBuilder = StrategyBuilder.create()
                .strategyName("小额现金贷-复贷用户风控策略")
                .ruleSet(RuleSetBuilder.create() // 规则集1
                        .ruleSetName("黑名单规则集")
                        .rule(RuleBuilder.create() // 规则集1-- 规则1
                                .ruleName("手机号是黑名单") // 规则名称
                                .ruleHitAction(new RuleHitMobileBlackListAction()) // 规则命中后执行动作
                                .ruleHitAction(new RuleHitDeviceBlackListAction()) // 规则命中后执行动作
                                .ruleCondition(RuleConditionBuilder.create() // 规则集1-- 规则1 -- 规则条件1
                                        .expression(DefaultExpressionEnum.equal.getExpression()) // 比较表达式为等于
                                        .relation(DefaultRelationEnum.and.getRelation()) // and 关系
                                        .targetValue("yes") // 比较目标值
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("内部系统-手机号黑名单")  // 数据指标名称
                                                .dataIndicatorKey("inner-blacklist-mobile") // 数据指标key
                                                .dataIndicatorInvokeKey("inner-blacklist-mobile-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-blacklist") // 数据源key
                                                        .build())
                                                .build())
                                        .build())

                                .ruleCondition(RuleConditionBuilder.create() // 规则集1-- 规则1 -- 规则条件2
                                        .expression(DefaultExpressionEnum.equal.getExpression())
                                        .relation(DefaultRelationEnum.or.getRelation()) //与前一个规则条件是or关系
                                        .targetValue("yes")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("外部系统-手机号黑名单")
                                                .dataIndicatorKey("outer-blacklist-mobile")
                                                .dataIndicatorInvokeKey("outer-blacklist-mobile-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("outer-blacklist")
                                                        .build())
                                                .build())
                                        .build())

                                .build())
                        .rule(RuleBuilder.create() // 规则集1-- 规则2
                                .ruleName("设备是黑名单")
                                .ruleHitAction(new RuleHitDeviceBlackListAction())
                                .ruleCondition(RuleConditionBuilder.create() // 规则集1-- 规则2 -- 规则条件1
                                        .expression(DefaultExpressionEnum.equal.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation())
                                        .targetValue("yes")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("内部系统-设备是黑名单")
                                                .dataIndicatorKey("inner-blacklist-device")
                                                .dataIndicatorInvokeKey("inner-blacklist-device-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-blacklist")
                                                        .build())
                                                .build())
                                        .build())

                                .ruleCondition(RuleConditionBuilder.create()  // 规则集1-- 规则2 -- 规则条件2
                                        .expression(DefaultExpressionEnum.less.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation()) //与前一个规则条件是and关系
                                        .targetValue("7")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("内部系统-设备注册时间小于7天")
                                                .dataIndicatorKey("inner-device-register-day")
                                                .dataIndicatorInvokeKey("inner-device-register-day-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-device")
                                                        .build())
                                                .build())
                                        .build())

                                .build())

                        .rule(RuleBuilder.create() // 规则集1-- 规则3
                                .ruleName("身份证号是黑名单")
                                .ruleCondition(RuleConditionBuilder.create() // 规则集1-- 规则3 -- 规则条件1
                                        .expression(DefaultExpressionEnum.equal.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation())
                                        .targetValue("yes")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("内部系统-身份证是黑名单")
                                                .dataIndicatorKey("inner-blacklist-idCard")
                                                .dataIndicatorInvokeKey("inner-blacklist-idCard-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-blacklist")
                                                        .build())
                                                .build())
                                        .build())

                                .ruleCondition(RuleConditionBuilder.create()  // 规则集1-- 规则3 -- 规则条件2
                                        .expression(DefaultExpressionEnum.notContains.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation())
                                        .targetValue("台湾,香港,澳门")// 身份证身份不在 台湾,香港,澳门
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("内部系统-身份证省份")
                                                .dataIndicatorKey("inner-user-idCard-pre6Name")
                                                .dataIndicatorInvokeKey("inner-user-idCard-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-user")
                                                        .build())
                                                .build())
                                        .build())

                                .build())

                        .build()
                )


                .ruleSet(RuleSetBuilder.create() // 规则集2
                        .ruleSetName("通讯录规则集")
                        .rule(RuleBuilder.create()
                                .ruleName("通讯录过少或过新") //  规则集2 -- 规则1
                                .ruleCondition(RuleConditionBuilder.create() // 规则集2 -- 规则1 --条件1
                                        .expression(DefaultExpressionEnum.less.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation())
                                        .targetValue("10") //通讯录数量小于10条
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("通讯录数量")
                                                .dataIndicatorKey("inner-user-addressBook-num")
                                                .dataIndicatorInvokeKey("inner-user-addressBook-num-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-user-addressBook")
                                                        .build())
                                                .build())
                                        .build())

                                .ruleCondition(RuleConditionBuilder.create() // 规则集2 -- 规则1 --条件2
                                        .expression(DefaultExpressionEnum.greaterAndEqual.getExpression())
                                        .relation(DefaultRelationEnum.or.getRelation())
                                        .targetValue("5")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("通讯录最短创建时间")
                                                .dataIndicatorKey("inner-user-addressBook-createTime-day")
                                                .dataIndicatorInvokeKey("inner-user-addressBook-num-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-user-addressBook")
                                                        .build())
                                                .build())
                                        .build())

                                .build())
                        .build()
                )


                .ruleSet(RuleSetBuilder.create() // 规则集3
                        .ruleSetName("多头规则集")
                        .rule(RuleBuilder.create()
                                .ruleName("近7天借款次数不超过3次")
                                .ruleCondition(RuleConditionBuilder.create()
                                        .expression(DefaultExpressionEnum.greater.getExpression())
                                        .relation(DefaultRelationEnum.and.getRelation())
                                        .targetValue("3")
                                        .dataIndicator(DataIndicatorBuilder.create()
                                                .dataIndicatorName("近7天借口次数")
                                                .dataIndicatorKey("inner-loan-borrow-num-7day")
                                                .dataIndicatorInvokeKey("inner-loan-borrow-num-7day-method")
                                                .dataSource(DataSourceBuilder.create()
                                                        .dataSourceKey("inner-loan")
                                                        .build())
                                                .build())
                                        .build())
                                .build())
                        .build()
                )
                ;

        StrategyRequest strategyRequest = StrategyRequestBuilder.create()
                .strategy(strategyBuilder.build()) // 配置风控策略
                .context(BizContext.create() // 配置业务上下文涉及的数据
                        .setMobile("1248983765").setDeviceId("o8djf300922jfkk2oi73jd"))
                .dataIndicatorRoute(MyDataIndicatorRoute.create()) //配置数据指标路由
                .build();

        StrategyExecuteResponse response = SimpleSequenceExecuter.create()
                .execute(strategyRequest); // 执行风控策略

        System.out.println(JSON.toJSONString(response));
~~~

#### 风控策略执行返回结果
~~~
{
        "strategyName": "小额现金贷-复贷用户风控策略", //风控策略名称
	"hitRuleNum": 3,  //该策略总共命中规则数
	"hitRuleSetNum": 3, //该策略总共命中规则集数
	"ruleSetExecuteResponseList": [{
		"hit": true,  // 规则集是否命中
		"hitRuleNum": 1, // 规则集下命中的规则数
		"ruleExecuteResponseList": [{
			"hit": true,  // 规则是否命中
			"hitScore": 0,
			"ruleExecuteDetail": "and 内部系统-手机号黑名单 [no 等于 yes] = false;or 外部系统-手机号黑名单 [yes 等于 yes] = true;",
			"ruleName": "手机号是黑名单"
		}, {
			"hit": false,
			"hitScore": 0,
			"ruleExecuteDetail": "and 内部系统-设备是黑名单 [no 等于 yes] = false;",
			"ruleName": "设备是黑名单"
		}, {
			"hit": false,
			"hitScore": 0,
			"ruleExecuteDetail": "and 内部系统-身份证是黑名单 [no 等于 yes] = false;",
			"ruleName": "身份证号是黑名单"
		}],
		"ruleSetName": "黑名单规则集"
	}, {
		"hit": true,
		"hitRuleNum": 1,
		"ruleExecuteResponseList": [{
			"hit": true,
			"hitScore": 0,
			"ruleExecuteDetail": "and 通讯录数量 [4 小于 10] = true;",
			"ruleName": "通讯录过少或过新"
		}],
		"ruleSetName": "通讯录规则集"
	}, {
		"hit": true,
		"hitRuleNum": 1,
		"ruleExecuteResponseList": [{
			"hit": true,
			"hitScore": 0,
			"ruleExecuteDetail": "and 近7天借口次数 [4 大于 3] = true;",
			"ruleName": "近7天借款次数不超过3次"
		}],
		"ruleSetName": "多头规则集"
	}]
}
~~~