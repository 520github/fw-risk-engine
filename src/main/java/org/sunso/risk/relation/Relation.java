package org.sunso.risk.relation;

/**
 * 规则条件之间的关系
 * 如： and、 or
 */
public interface Relation {

    Relation setRelationKey(String relationKey);

    String getRelationKey();
}
