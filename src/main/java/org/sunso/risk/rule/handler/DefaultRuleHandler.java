package org.sunso.risk.rule.handler;

import org.sunso.risk.context.Context;
import org.sunso.risk.relation.AndRelation;
import org.sunso.risk.relation.OrRelation;
import org.sunso.risk.request.StrategyRequest;
import org.sunso.risk.response.RuleConditionExecuteResponse;
import org.sunso.risk.response.RuleExecuteResponse;
import org.sunso.risk.rule.Rule;
import org.sunso.risk.rule.RuleCondition;
import org.sunso.risk.rule.join.AndRelationJoin;
import org.sunso.risk.rule.join.OrRelationJoin;
import org.sunso.risk.rule.join.RelationJoin;
import org.sunso.risk.rule.join.RuleConditionRelationJoin;

public class DefaultRuleHandler implements RuleHandler {

    public static DefaultRuleHandler create() {
        return new DefaultRuleHandler();
    }

    @Override
    public RuleExecuteResponse handle(Rule rule, StrategyRequest request) {
        RuleExecuteResponse response = RuleExecuteResponse.create();
        // 获取规则的执行结果
        RuleConditionExecuteResponse ruleConditionExecuteResponse = RuleConditionExecuteResponse.create();
        response.setHit(getRelationJoin(rule).join(request, ruleConditionExecuteResponse));
        response.setRuleExecuteDetail(ruleConditionExecuteResponse.getRuleConditionResult());
        return response;
    }

    private RelationJoin getRelationJoin(Rule rule) {
        RelationJoin relationJoin = null;
        for (RuleCondition ruleCondition : rule.getRuleConditionList()) {
            RuleConditionRelationJoin ruleConditionRelationJoin = RuleConditionRelationJoin.create(ruleCondition);
            if (ruleCondition.getRelation() instanceof AndRelation) {
                relationJoin = new AndRelationJoin(relationJoin, ruleConditionRelationJoin);
            } else if (ruleCondition.getRelation() instanceof OrRelation) {
                relationJoin = new OrRelationJoin(relationJoin, ruleConditionRelationJoin);
            }
        }
        return relationJoin;
    }
}
