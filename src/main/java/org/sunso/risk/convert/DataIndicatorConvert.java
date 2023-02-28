package org.sunso.risk.convert;

import org.sunso.risk.data.indicator.DataIndicator;

public interface DataIndicatorConvert<B> {
    DataIndicator convert(B b);
}
