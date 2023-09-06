package org.sunso.risk;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.sunso.risk.context.Context;
import org.sunso.risk.context.DemoContext;
import org.sunso.risk.convert.DemoStrategyConvert;
import org.sunso.risk.data.MockDataIndicatorRoute;
import org.sunso.risk.data.indicator.DataIndicatorRoute;
import org.sunso.risk.dispatcher.Dispatcher;
import org.sunso.risk.dispatcher.SimpleSequenceDispatcher;
import org.sunso.risk.entity.DemoStrategyEntityBuilder;
import org.sunso.risk.executer.SimpleSequenceExecuter;
import org.sunso.risk.expression.factory.DefaultExpressionFactory;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.DefaultRelationFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.StrategyExecuteResponse;
import org.sunso.risk.rule.handler.DefaultRuleHandler;
import org.sunso.risk.rule.handler.DefaultRuleHitHandler;
import org.sunso.risk.rule.handler.RuleHandler;
import org.sunso.risk.rule.handler.RuleHitHandler;
import org.sunso.risk.strategy.Strategy;

/**
 * 基于convert转化方式，测试风控策略流程
 */
public class RiskStrategyConvertTest extends AbstractTest {

    @Test
    public void riskStrategyTest() {
        StrategyExecuteResponse response = SimpleSequenceExecuter
                .create()
                .execute(getStrategyRequest());

        System.out.println(JSON.toJSONString(response));
    }

    /**
     * 定义策略请求参数
     * @return
     */
    private StrategyRequest getStrategyRequest() {
        return StrategyRequest.create()
                .setStrategy(getStrategy())
                .setContext(getContext())
                .setDispatcher(getDispatcher())
                .setExpressionFactory(getExpressionFactory())
                .setRelationFactory(getRelationFactory())
                .setRuleHandler(getRuleHandler())
                .setRuleHitHandler(getRuleHitHandler())
                .setDataIndicatorRoute(getDataIndicatorRoute());
    }

    /**
     * 定义策略配置
     * @return
     */
    private Strategy getStrategy() {
        return DemoStrategyConvert.getInstance()
                .convert(DemoStrategyEntityBuilder.create().newDemoStrategyEntity(),
                getExpressionFactory(), getRelationFactory());
    }

    /**
     * 定义规则命中处理器
     * @return
     */
    private RuleHitHandler getRuleHitHandler() {
        return DefaultRuleHitHandler.create();
    }

    /**
     * 定义规则处理器
     * @return
     */
    private RuleHandler getRuleHandler() {
        return DefaultRuleHandler.create();
    }

    /**
     * 定义上下文
     * @return
     */
    private Context getContext() {
        return DemoContext.create();
    }

    /**
     * 定义执行分发器
     * @return
     */
    private Dispatcher getDispatcher() {
        return SimpleSequenceDispatcher.create();
    }

    /**
     * 定义规则条件表达式工厂
     * @return
     */
    private ExpressionFactory getExpressionFactory() {
        return DefaultExpressionFactory.create();
    }

    /**
     * 定义规则条件关系工厂
     * @return
     */
    private RelationFactory getRelationFactory() {
        return DefaultRelationFactory.create();
    }

    /**
     * 定义数据指标路由
     * @return
     */
    private DataIndicatorRoute getDataIndicatorRoute() {
        return MockDataIndicatorRoute.create();
    }

}
