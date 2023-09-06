package org.sunso.risk.context;

public class BizContext implements Context {

    private String mobile;
    private String deviceId;

    public static BizContext create() {
        return new BizContext();
    }

    public String getMobile() {
        return mobile;
    }

    public BizContext setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public BizContext setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
}
