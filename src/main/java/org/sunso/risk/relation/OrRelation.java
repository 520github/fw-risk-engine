package org.sunso.risk.relation;

/**
 * 规则条件之间or关系
 */
public class OrRelation implements Relation {
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
