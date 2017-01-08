package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Guest_List;
import com.f4.letparty.server.model.GuestListPK;
import com.f4.letparty.server.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Dang on 1/7/2017.
 */
public interface Guest_ListRepository extends JpaRepository <Guest_List, GuestListPK>{
    @Query("select u from Guest_List u where u.id.guest_ID = :id")
    List<Guest_List> findById(@Param("id") int id);

    @Query("select u from Guest_List u where u.id.invitation_ID = :id AND u.isAccepted = \'1\'")
    List<Guest_List> findAcceptedById(@Param("id") int id);

}
