package org.sunso.risk.convert;

import org.sunso.risk.data.indicator.DataIndicator;

/**
 * 数据指标转化器
 * 从其它业务对象抽取数据指标相关数据
 * @param <B>
 */
public interface DataIndicatorConvert<B> {
    DataIndicator convert(B b);
}
