package org.sunso.risk.data.indicator;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicator;

/**
 * 数据指标路由接口
 * 该路由负责获取数据指标对应的计算值，
 * 如：可以从数据中心获取数据库， 或本地查库获取数据， 或从缓存读取数据
 */
public interface DataIndicatorRoute {

    /**
     * 计算数据指标值
     * @param dataIndicator
     * @param context
     * @return
     */
    String calDataIndicator(DataIndicator dataIndicator, Context context);
}
