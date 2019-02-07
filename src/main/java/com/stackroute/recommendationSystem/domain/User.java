package com.stackroute.recommendationSystem.domain;

import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
public class User {
    @Id
    Long id;
    private String emailid;
    private String interests;
    @Relationship(type="ATTEMPTED",direction = Relationship.INCOMING)
    List<Question> questions;
    @Relationship(type="tags",direction = Relationship.INCOMING)
    List<Question> tags;
}
