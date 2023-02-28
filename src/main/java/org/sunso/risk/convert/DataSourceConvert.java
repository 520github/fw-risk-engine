package org.sunso.risk.convert;

import org.sunso.risk.data.source.DataSource;

public interface DataSourceConvert<B> {
    DataSource convert(B b);
}
