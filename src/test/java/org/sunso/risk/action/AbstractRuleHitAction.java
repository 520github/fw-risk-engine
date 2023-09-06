package org.sunso.risk.action;

import org.sunso.risk.context.BizContext;
import org.sunso.risk.request.StrategyRequest;

public abstract class AbstractRuleHitAction implements RuleHitAction {

    public BizContext getBizContext(StrategyRequest request) {
        if (request.getContext() instanceof BizContext) {
            return (BizContext) request.getContext();
        }
        return null;
    }

    /**
     * 获取手机号
     * @param request
     * @return
     */
    public String getMobile(StrategyRequest request) {
        BizContext bizContext = getBizContext(request);
        if (bizContext != null) {
            return bizContext.getMobile();
        }
        return null;
    }

    /**
     * 获取设备id
     * @param request
     * @return
     */
    public String getDeviceId(StrategyRequest request) {
        BizContext bizContext = getBizContext(request);
        if (bizContext != null) {
            return bizContext.getDeviceId();
        }
        return null;
    }
}
