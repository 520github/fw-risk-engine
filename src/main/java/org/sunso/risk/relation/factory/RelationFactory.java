package org.sunso.risk.relation.factory;

import org.sunso.risk.relation.Relation;

public interface RelationFactory {
    Relation getRelation(String relationKey);
}
