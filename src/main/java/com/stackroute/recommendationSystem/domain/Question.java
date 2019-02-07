package com.stackroute.recommendationSystem.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@Data
@NodeEntity
public class Question {
    @Id
    private int id;
    private String title;
    private String description;
    /**On the basis of upvotes level will be upgraded**/
    private String  level;
}
