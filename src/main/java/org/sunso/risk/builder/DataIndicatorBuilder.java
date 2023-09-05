package org.sunso.risk.builder;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.data.indicator.DefaultDataIndicator;
import org.sunso.risk.data.source.DataSource;

public class DataIndicatorBuilder {
    private String dataIndicatorName;
    private String dataIndicatorKey;
    private String dataIndicatorInvokeKey;

    private DataSource dataSource;

    public static DataIndicatorBuilder create() {
        return new DataIndicatorBuilder();
    }

    public DataIndicatorBuilder dataIndicatorName(String dataIndicatorName) {
        this.dataIndicatorName = dataIndicatorName;
        return this;
    }

    public DataIndicatorBuilder dataIndicatorKey(String dataIndicatorKey) {
        this.dataIndicatorKey = dataIndicatorKey;
        return this;
    }

    public DataIndicatorBuilder dataIndicatorInvokeKey(String dataIndicatorInvokeKey) {
        this.dataIndicatorInvokeKey = dataIndicatorInvokeKey;
        return this;
    }

    public DataIndicatorBuilder dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public DataIndicator build() {
        return DefaultDataIndicator.create()
                .setDataIndicatorKey(dataIndicatorKey)
                .setDataIndicatorName(dataIndicatorName)
                .setDataIndicatorInvokeKey(dataIndicatorInvokeKey)
                .setDataSource(dataSource);
    }
}
