package com.stackroute.recommendationSystem.repository;

import com.stackroute.recommendationSystem.domain.Question;
import com.stackroute.recommendationSystem.domain.User;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends Neo4jRepository<User,Long> {
    @Query("MATCH (n:User) RETURN n LIMIT 25")
    List<User> getAllUsers();

//    User findByInterests(@Param("interests") String interests);

//    @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT {limit}")
//        Collection<User> graph(@Param("limit") int limit);

    @Query("MATCH (n:User) RETURN n LIMIT 25 \n SET user.name=\"Swathi\"")
    User updateUserNode(@Param("emailid") String emailId);

    @Query("MATCH (u:User)<-[a:ATTEMPTED]-(q:Question) RETURN u,a,q")
    List<User> getAllUsersRelations();

    @Query("Create(user:User{id:{id},emailid:\"emailid\",interests:\"interests\"})")
    User saveUser(@Param("id") Long id, @Param("emailid") String emailid ,@Param("interests") String interests);

}
