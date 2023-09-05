package org.sunso.risk.data.source;

/**
 * 默认数据源实现
 */
public class DefaultDataSource implements DataSource {
    /**
     * 数据源key
     */
    private String dataSourceKey;

    public static DefaultDataSource create() {
        return new DefaultDataSource();
    }

    @Override
    public DataSource setDataSourceKey(String dataSourceKey) {
        this.dataSourceKey = dataSourceKey;
        return this;
    }

    @Override
    public String getDataSourceKey() {
        return dataSourceKey;
    }
}
