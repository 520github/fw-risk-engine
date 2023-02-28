package org.sunso.risk.relation;

public enum DefaultRelationEnum {
    and("and", "and", new AndRelation()), or("or", "or", new OrRelation()),;

    String relationKey;
    String relationName;
    Relation relation;

    DefaultRelationEnum(String relationKey, String relationName, Relation relation) {
        this.relationKey = relationKey;
        this.relationName = relationName;
        this.relation = relation;
    }

    public String getRelationKey() {
        return relationKey;
    }

    public String getRelationName() {
        return relationName;
    }

    public Relation getRelation() {
        return relation;
    }

    public static Relation getRelationByRelationKey(String relationKey) {
        for (DefaultRelationEnum relationEnum : values()) {
            if (relationEnum.relationKey.equals(relationKey)) {
                return relationEnum.getRelation().setRelationKey(relationKey);
            }
        }
        return null;
    }
}
