package org.sunso.risk.data;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.data.indicator.DataIndicatorRoute;

/**
 * mock数据指标路由
 * 数据指标计算值直接返回： 数据指标key+"--value"
 */
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
