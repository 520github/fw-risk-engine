package org.sunso.risk.builder;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicatorRoute;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.strategy.Strategy;

public class StrategyRequestBuilder {
    private Strategy strategy;
    private Context context;
    private DataIndicatorRoute dataIndicatorRoute;

    public static StrategyRequestBuilder create() {
        return new StrategyRequestBuilder();
    }

    public StrategyRequestBuilder strategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public StrategyRequestBuilder context(Context context) {
        this.context = context;
        return this;
    }

    public StrategyRequestBuilder dataIndicatorRoute(DataIndicatorRoute dataIndicatorRoute) {
        this.dataIndicatorRoute = dataIndicatorRoute;
        return this;
    }

    public StrategyRequest build() {
        return StrategyRequest.create()
                .setStrategy(strategy)
                .setContext(context)
                .setDataIndicatorRoute(dataIndicatorRoute)
                ;
    }
}
