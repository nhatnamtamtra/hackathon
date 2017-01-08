package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Friend_List;
import com.f4.letparty.server.model.FriendListPK;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by Dang on 1/7/2017.
 */
public interface Friend_ListRepository extends JpaRepository <Friend_List, FriendListPK>{
}
