package org.sunso.risk.builder;

import org.sunso.risk.data.source.DataSource;
import org.sunso.risk.data.source.DefaultDataSource;

public class DataSourceBuilder {

    private String dataSourceKey;
    public static DataSourceBuilder create() {
        return new DataSourceBuilder();
    }

    public DataSourceBuilder dataSourceKey(String dataSourceKey) {
        this.dataSourceKey = dataSourceKey;
        return this;
    }

    public DataSource build() {
        return new DefaultDataSource().setDataSourceKey(dataSourceKey);
    }
}
