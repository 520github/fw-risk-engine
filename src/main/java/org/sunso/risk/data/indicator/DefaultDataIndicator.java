package org.sunso.risk.data.indicator;

import org.sunso.risk.data.source.DataSource;

/**
 * 数据指标默认实现
 */
public class DefaultDataIndicator implements DataIndicator {
    private String dataIndicatorKey;
    private String dataIndicatorName;
    private String dataIndicatorInvokeKey;
    private DataSource dataSource;

    public static DefaultDataIndicator create() {
        return new DefaultDataIndicator();
    }

    @Override
    public DataIndicator setDataIndicatorKey(String dataIndicatorKey) {
        this.dataIndicatorKey = dataIndicatorKey;
        return this;
    }

    @Override
    public String getDataIndicatorKey() {
        return dataIndicatorKey;
    }

    @Override
    public DataIndicator setDataIndicatorName(String dataIndicatorName) {
        this.dataIndicatorName = dataIndicatorName;
        return this;
    }

    @Override
    public String getDataIndicatorName() {
        return dataIndicatorName;
    }

    @Override
    public DataIndicator setDataIndicatorInvokeKey(String dataIndicatorInvokeKey) {
        this.dataIndicatorInvokeKey = dataIndicatorInvokeKey;
        return this;
    }

    @Override
    public String getDataIndicatorInvokeKey() {
        return dataIndicatorInvokeKey;
    }

    @Override
    public DataIndicator setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    @Override
    public DataSource getDatasource() {
        return dataSource;
    }
}
