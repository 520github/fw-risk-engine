package org.sunso.risk.request;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicatorRoute;
import org.sunso.risk.dispatcher.Dispatcher;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.handler.RuleHandler;
import org.sunso.risk.rule.handler.RuleHitHandler;
import org.sunso.risk.strategy.Strategy;

/**
 * 风控策略请求参数
 * @param <C>
 */
public class StrategyRequest<C extends Context> {
    /**
     * 业务上下文
     */
    private C context;

    /**
     * 风控策略
     */
    private Strategy strategy;

    /**
     * 规则集执行分发器
     */
    private Dispatcher dispatcher;

    /**
     * 规则条件表达式工厂
     */
    private ExpressionFactory expressionFactory;

    /**
     * 规则条件关系工厂
     */
    private RelationFactory relationFactory;

    /**
     * 规则处理器
     */
    private RuleHandler ruleHandler;

    /**
     * 规则命中处理器
     */
    private RuleHitHandler ruleHitHandler;

    /**
     * 数据指标路由
     */
    private DataIndicatorRoute dataIndicatorRoute;

    public static StrategyRequest create() {
        return new StrategyRequest();
    }

    public C getContext() {
        return context;
    }

    public StrategyRequest<C> setContext(C context) {
        this.context = context;
        return this;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public StrategyRequest<C> setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public StrategyRequest<C> setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
        return this;
    }

    public ExpressionFactory getExpressionFactory() {
        return expressionFactory;
    }

    public StrategyRequest<C> setExpressionFactory(ExpressionFactory expressionFactory) {
        this.expressionFactory = expressionFactory;
        return this;
    }

    public RelationFactory getRelationFactory() {
        return relationFactory;
    }

    public StrategyRequest<C> setRelationFactory(RelationFactory relationFactory) {
        this.relationFactory = relationFactory;
        return this;
    }

    public RuleHandler getRuleHandler() {
        return ruleHandler;
    }

    public StrategyRequest<C> setRuleHandler(RuleHandler ruleHandler) {
        this.ruleHandler = ruleHandler;
        return this;
    }

    public RuleHitHandler getRuleHitHandler() {
        return ruleHitHandler;
    }

    public StrategyRequest<C> setRuleHitHandler(RuleHitHandler ruleHitHandler) {
        this.ruleHitHandler = ruleHitHandler;
        return this;
    }

    public DataIndicatorRoute getDataIndicatorRoute() {
        return dataIndicatorRoute;
    }

    public StrategyRequest<C> setDataIndicatorRoute(DataIndicatorRoute dataIndicatorRoute) {
        this.dataIndicatorRoute = dataIndicatorRoute;
        return this;
    }
}
