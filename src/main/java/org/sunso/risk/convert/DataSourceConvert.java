package org.sunso.risk.convert;

import org.sunso.risk.data.source.DataSource;

/**
 * 数据源转换器
 * 从其它业务对象抽取数据源相关数据
 * @param <B>
 */
public interface DataSourceConvert<B> {
    DataSource convert(B b);
}
