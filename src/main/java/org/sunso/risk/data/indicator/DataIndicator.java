package org.sunso.risk.data.indicator;

import org.sunso.risk.data.source.DataSource;

/**
 * 数据指标定义
 */
public interface DataIndicator {

    /**
     * 设置数据指标key
     * @param dataIndicatorKey
     * @return
     */
    DataIndicator setDataIndicatorKey(String dataIndicatorKey);

    String getDataIndicatorKey();

    /**
     * 设置数据指标名称
     * @param dataIndicatorName
     * @return
     */
    DataIndicator setDataIndicatorName(String dataIndicatorName);

    String getDataIndicatorName();

    /**
     * 数据指标对应的invokeKey
     * @param dataIndicatorInvokeKey
     * @return
     */
    DataIndicator setDataIndicatorInvokeKey(String dataIndicatorInvokeKey);

    String getDataIndicatorInvokeKey();

    /**
     * 设置数据指标对应的数据源
     * @param dataSource
     * @return
     */
    DataIndicator setDataSource(DataSource dataSource);

    DataSource getDatasource();

}
