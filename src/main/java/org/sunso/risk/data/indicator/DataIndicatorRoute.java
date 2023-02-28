package org.sunso.risk.data.indicator;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicator;

public interface DataIndicatorRoute {
    String calDataIndicator(DataIndicator dataIndicator, Context context);
}
