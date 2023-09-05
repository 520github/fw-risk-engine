package org.sunso.risk.relation.factory;

import org.sunso.risk.relation.DefaultRelationEnum;
import org.sunso.risk.relation.Relation;

/**
 * 规则条件关系的默认工厂实现
 */
public class DefaultRelationFactory implements RelationFactory {

    public static DefaultRelationFactory create() {
        return new DefaultRelationFactory();
    }

    @Override
    public Relation getRelation(String relationKey) {
        return DefaultRelationEnum.getRelationByRelationKey(relationKey);
    }
}
