package org.sunso.risk.relation;

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
