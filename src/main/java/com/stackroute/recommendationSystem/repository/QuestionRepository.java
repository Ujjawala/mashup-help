package com.stackroute.recommendationSystem.repository;

import com.stackroute.recommendationSystem.domain.Question;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface QuestionRepository extends Neo4jRepository<Question,Long> {
    @Query("MATCH (n:Question) RETURN n LIMIT 25\n")
     List<Question> getAllQuestion();

//    public Collection<Question> getAllQuestion();
//    Collection<Question> findQuestion(@Param("questions") List<Question> questions);
//    public List<Question> returnQuestions();
}


