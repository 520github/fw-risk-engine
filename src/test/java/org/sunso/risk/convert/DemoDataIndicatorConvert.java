package org.sunso.risk.convert;

import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.data.indicator.DefaultDataIndicator;
import org.sunso.risk.entity.DemoRuleConditionEntity;

public class DemoDataIndicatorConvert implements DataIndicatorConvert<DemoRuleConditionEntity> {

    public static DemoDataIndicatorConvert getInstance() {
        return DemoDataIndicatorConvertHolder.INSTANCE;
    }

    @Override
    public DataIndicator convert(DemoRuleConditionEntity demoRuleConditionEntity) {
        return DefaultDataIndicator.create().setDataIndicatorKey(demoRuleConditionEntity.getDataIndicatorKey())
                .setDataIndicatorName(demoRuleConditionEntity.getDataIndicatorName())
                .setDataIndicatorInvokeKey(demoRuleConditionEntity.getDataIndicatorInvokeKey())
                .setDataSource(DemoDataSourceConvert.getInstance().convert(demoRuleConditionEntity));
    }

    private static class DemoDataIndicatorConvertHolder {
        private static final DemoDataIndicatorConvert INSTANCE = new DemoDataIndicatorConvert();
    }
}
