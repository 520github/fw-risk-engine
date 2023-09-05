package org.sunso.risk.data.source;

/**
 * 数据源定义
 */
public interface DataSource {

    /**
     * 设置数据源key
     * @param dataSourceKey
     * @return
     */
    DataSource setDataSourceKey(String dataSourceKey);

    String getDataSourceKey();
}
