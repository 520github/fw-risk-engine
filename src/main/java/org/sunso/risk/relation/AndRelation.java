package org.sunso.risk.relation;

/**
 * 规则条件之间and关系
 */
public class AndRelation implements Relation {
    private String relationKey;

    @Override
    public Relation setRelationKey(String relationKey) {
        this.relationKey = relationKey;
        return this;
    }

    @Override
    public String getRelationKey() {
        return relationKey;
    }
}
