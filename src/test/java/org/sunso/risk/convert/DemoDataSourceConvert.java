package org.sunso.risk.convert;

import org.sunso.risk.data.source.DataSource;
import org.sunso.risk.data.source.DefaultDataSource;
import org.sunso.risk.entity.DemoRuleConditionEntity;

public class DemoDataSourceConvert implements DataSourceConvert<DemoRuleConditionEntity> {

    public static DemoDataSourceConvert getInstance() {
        return DemoDataSourceConvertHolder.INSTANCE;
    }

    @Override
    public DataSource convert(DemoRuleConditionEntity demoRuleConditionEntity) {
        return DefaultDataSource.create().setDataSourceKey(demoRuleConditionEntity.getDataSourceKey());
    }

    private static class DemoDataSourceConvertHolder {
        private static final DemoDataSourceConvert INSTANCE = new DemoDataSourceConvert();
    }
}
