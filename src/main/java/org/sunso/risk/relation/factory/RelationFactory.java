package org.sunso.risk.relation.factory;

import org.sunso.risk.relation.Relation;

/**
 * 规则条件关系的工厂
 */
public interface RelationFactory {
    /**
     * 根据关系key获取对应的关系对象
     * @param relationKey
     * @return
     */
    Relation getRelation(String relationKey);
}
