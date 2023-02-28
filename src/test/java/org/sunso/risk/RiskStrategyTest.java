package org.sunso.risk;

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

public class RiskStrategyTest extends AbstractTest {

    @Test
    public void riskStrategyTest() {
        StrategyExecuteResponse response = SimpleSequenceExecuter.create().execute(getStrategyRequest());
        System.out.println(response);
    }

    private Strategy getStrategy() {
        return DemoStrategyConvert.getInstance().convert(DemoStrategyEntityBuilder.create().newDemoStrategyEntity(),
                getExpressionFactory(), getRelationFactory());
    }

    private StrategyRequest getStrategyRequest() {
        return StrategyRequest.create().setStrategy(getStrategy()).setContext(getContext())
                .setDispatcher(getDispatcher()).setExpressionFactory(getExpressionFactory())
                .setRelationFactory(getRelationFactory()).setRuleHandler(getRuleHandler())
                .setRuleHitHandler(getRuleHitHandler()).setDataIndicatorRoute(getDataIndicatorRoute());
    }

    private RuleHitHandler getRuleHitHandler() {
        return DefaultRuleHitHandler.create();
    }

    private RuleHandler getRuleHandler() {
        return DefaultRuleHandler.create();
    }

    private Context getContext() {
        return DemoContext.create();
    }

    private Dispatcher getDispatcher() {
        return SimpleSequenceDispatcher.create();
    }

    private ExpressionFactory getExpressionFactory() {
        return DefaultExpressionFactory.create();
    }

    private RelationFactory getRelationFactory() {
        return DefaultRelationFactory.create();
    }

    private DataIndicatorRoute getDataIndicatorRoute() {
        return MockDataIndicatorRoute.create();
    }

}
