package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Friend_List;
import com.f4.letparty.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bbphuc on 07/01/2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
   // @Query("select u from User u, Friend_List f where f.host_id = :id AND f.id.friend_id = u.user_id")
    //List<User> findById(@Param("id") int id);
}
