package org.sunso.risk.route;

import org.sunso.risk.context.Context;
import org.sunso.risk.data.indicator.DataIndicator;
import org.sunso.risk.data.indicator.DataIndicatorRoute;

import java.util.HashMap;
import java.util.Map;

/**
 * mock数据指标路由
 * 数据指标计算值直接返回： 数据指标key+"--value"
 */
public class MyDataIndicatorRoute implements DataIndicatorRoute {

    public static MyDataIndicatorRoute create() {
        return new MyDataIndicatorRoute();
    }

    @Override
    public String calDataIndicator(DataIndicator dataIndicator, Context context) {
        return getMockValue(dataIndicator);
    }

    private String getMockValue(DataIndicator dataIndicator) {
        Map<String, String> dataMap = getDataMapByDataSource(dataIndicator);
        String value = dataMap.get(dataIndicator.getDataIndicatorKey());
        if (value != null) {
            return value;
        }
        return dataIndicator.getDataIndicatorKey() + "--value";
    }

    private Map<String, String> getDataMapByDataSource(DataIndicator dataIndicator) {
        String dataSourceKey = dataIndicator.getDatasource().getDataSourceKey();
        if ("inner-blacklist".equalsIgnoreCase(dataSourceKey)) {
            return innerBlacklistDataSourceDataMap();
        }
        else if ("outer-blacklist".equalsIgnoreCase(dataSourceKey)) {
            return outerBlacklistDataSourceDataMap();
        }
        else if ("inner-device".equalsIgnoreCase(dataSourceKey)) {
            return innerDeviceDataSourceDataMap();
        }
        else if ("inner-user".equalsIgnoreCase(dataSourceKey)) {
            return innerUserDataSourceDataMap();
        }
        else if ("inner-user-addressBook".equalsIgnoreCase(dataSourceKey)) {
            return innerUserAddressBookDataSourceDataMap();
        }
        else if ("inner-loan".equalsIgnoreCase(dataSourceKey)) {
            return innerLoanDataSourceDataMap();
        }
        return null;
    }

    private Map<String, String> innerBlacklistDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("inner-blacklist-mobile", "yes");// 内部手机号黑名单
        dataMap.put("inner-blacklist-device", "yes");// 内部设备黑名单
        dataMap.put("inner-blacklist-idCard", "yes");// 内部身份证号黑名单
        return dataMap;
    }

    private Map<String, String> outerBlacklistDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("outer-blacklist-mobile", "yes");// 外部手机号黑名单
        return dataMap;
    }

    private Map<String, String> innerDeviceDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("inner-device-register-day", "5");// 设备注册时间天数
        return dataMap;
    }

    private Map<String, String> innerUserDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("inner-user-idCard-pre6Name", "北京");// 身份证号对应省份
        return dataMap;
    }

    private Map<String, String> innerUserAddressBookDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("inner-user-addressBook-num", "4");// 通讯录数量
        dataMap.put("inner-user-addressBook-createTime-day", "5"); //通讯录最短创建时间天数
        return dataMap;
    }

    private Map<String, String> innerLoanDataSourceDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("inner-loan-borrow-num-7day", "4");// 近7天借款次数
        return dataMap;
    }
}
