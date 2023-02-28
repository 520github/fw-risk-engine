package org.sunso.risk.data;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.data.indicator.DataIndicatorRoute;

public class MockDataIndicatorRoute implements DataIndicatorRoute {

    public static MockDataIndicatorRoute create() {
        return new MockDataIndicatorRoute();
    }

    @Override
    public String calDataIndicator(DataIndicator dataIndicator, Context context) {
        return getMockValue(dataIndicator);
    }

    private String getMockValue(DataIndicator dataIndicator) {
        return dataIndicator.getDataIndicatorKey() + "--value";
    }
}
