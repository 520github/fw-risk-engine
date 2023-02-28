package org.sunso.risk.data.indicator;

import org.sunso.risk.data.source.DataSource;

public interface DataIndicator {

    DataIndicator setDataIndicatorKey(String dataIndicatorKey);

    String getDataIndicatorKey();

    DataIndicator setDataIndicatorName(String dataIndicatorName);

    String getDataIndicatorName();

    DataIndicator setDataIndicatorInvokeKey(String dataIndicatorInvokeKey);

    String getDataIndicatorInvokeKey();

    DataIndicator setDataSource(DataSource dataSource);

    DataSource getDatasource();

}
