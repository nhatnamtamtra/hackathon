package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.f4.letparty.server.model.Friend_List;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Dang on 1/7/2017.
 */
public interface Friend_ListRepository extends JpaRepository <Friend_List, FriendListPK>{
    @Query("select u from User u, Friend_List f where f.id.friend_id = u.user_id AND f.id.host_id = :id")
    List<Friend_List> findById(@Param("id") Integer id);
}
