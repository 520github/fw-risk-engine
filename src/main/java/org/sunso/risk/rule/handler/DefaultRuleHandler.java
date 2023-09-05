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

/**
 * 默认规则处理器
 */
public class DefaultRuleHandler implements RuleHandler {

    public static DefaultRuleHandler create() {
        return new DefaultRuleHandler();
    }

    @Override
    public RuleExecuteResponse handle(Rule rule, StrategyRequest request) {
        //规则执行结果
        RuleExecuteResponse response = RuleExecuteResponse.create();
        //规则条件执行结果
        RuleConditionExecuteResponse ruleConditionExecuteResponse = RuleConditionExecuteResponse.create();
        //执行规则集下所有的规则条件，返回当前规则是否命中结果
        boolean hit = getRelationJoin(rule).join(request, ruleConditionExecuteResponse);
        response.setHit(hit);
        //规则执行详情
        response.setRuleExecuteDetail(ruleConditionExecuteResponse.getRuleConditionResult());
        return response;
    }

    /**
     * 获取单个规则里所有规则条件的关系
     * @param rule
     * @return
     */
    private RelationJoin getRelationJoin(Rule rule) {
        RelationJoin relationJoin = null;
        for (RuleCondition ruleCondition : rule.getRuleConditionList()) {
            RuleConditionRelationJoin ruleConditionRelationJoin = RuleConditionRelationJoin.create(ruleCondition);
            // and关系
            if (ruleCondition.getRelation() instanceof AndRelation) {
                relationJoin = new AndRelationJoin(relationJoin, ruleConditionRelationJoin);
            }
            // or关系
            else if (ruleCondition.getRelation() instanceof OrRelation) {
                relationJoin = new OrRelationJoin(relationJoin, ruleConditionRelationJoin);
            }
        }
        return relationJoin;
    }
}
