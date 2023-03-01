独立、可扩展、高性能的风控引擎框架
======================

#### 前言
* it is doing


#### 概念说明

| 概念             | 说明             | 接口                                            |
|----------------|----------------|-----------------------------------------------|
| Strategy          | 风控策略，由多个规则集组合  | org.sunso.risk.strategy.Strategy              |
| RuleSet          | 规则集，由多个规则组成    | org.sunso.risk.rule.RuleSet                   |
| Rule          | 规则，由多个规则条件组成   | org.sunso.risk.rule.Rule                      |
| RuleCondition        | 规则条件，由多个数据指标组成 | org.sunso.risk.rule.RuleCondition             |
| DataIndicator         | 数据指标           | org.sunso.risk.data.indicator.DataIndicator   |
| DataSource       | 数据源            | org.sunso.risk.data.source.DataSource         |
| DataIndicator         | 数据指标路由器        | org.sunso.risk.data.indicator.DataIndicatorRoute |
| DataSource       | 数据源路由器         | org.sunso.risk.data.source.DataSourceRoute    |
| DataType   | 数据类型           | org.sunso.risk.data.type.DataType             |
| Action | 规则命中动作         | org.sunso.risk.action.Action                  |
| Expression        | 规则条件的表达式       | org.sunso.statemachine.response.BizCode       |
| Relation       | 规则条件之间的关系      | org.sunso.risk.relation.Relation              |
| RelationJoin        | 关系连接点          | org.sunso.risk.rule.join.RelationJoin         |
| RuleHandler       | 规则处理器          | org.sunso.risk.rule.handler.RuleHandler       |
| RuleHitHandler        | 规则命中处理器        | org.sunso.risk.rule.handler.RuleHitHandler    |
| Dispatcher      | 不同类型分发器        | org.sunso.risk.dispatcher.Dispatcher          |
| Executer     | 风控策略执行器        | org.sunso.risk.executer.Executer              |
| Context     | 业务上下文          | org.sunso.risk.context.Context                       |


