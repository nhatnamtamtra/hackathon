package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Friend_List;
import com.f4.letparty.server.model.Invitation;
import com.f4.letparty.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bbphuc on 07/01/2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.user_id = :id")
    User findById(@Param("id") int id);
}
