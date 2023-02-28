package org.sunso.risk.request;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicatorRoute;
import org.sunso.risk.dispatcher.Dispatcher;
import org.sunso.risk.expression.factory.ExpressionFactory;
import org.sunso.risk.relation.factory.RelationFactory;
import org.sunso.risk.rule.handler.RuleHandler;
import org.sunso.risk.rule.handler.RuleHitHandler;
import org.sunso.risk.strategy.Strategy;

public class StrategyRequest<C extends Context> {
    private C context;
    private Strategy strategy;
    private Dispatcher dispatcher;
    private ExpressionFactory expressionFactory;
    private RelationFactory relationFactory;
    private RuleHandler ruleHandler;
    private RuleHitHandler ruleHitHandler;
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
