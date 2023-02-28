package org.sunso.risk.rule.join;

import org.sunso.risk.context.Context;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;

public class AndRelationJoin extends AbstractRelationJoin {
    private RelationJoin rj1;
    private RelationJoin rj2;

    public AndRelationJoin(RelationJoin rj1, RelationJoin rj2) {
        this.rj1 = rj1;
        this.rj2 = rj2;
    }

    @Override
    public boolean join(StrategyRequest request, RuleConditionExecuteResponse ruleConditionExecuteResponse) {
        return (rj1 == null || rj1.join(request, ruleConditionExecuteResponse))
                && (rj2 == null || rj2.join(request, ruleConditionExecuteResponse));
    }
}
