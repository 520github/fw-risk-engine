package org.sunso.risk.data.source;

public class DefaultDataSource implements DataSource {
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
