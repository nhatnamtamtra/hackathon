package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Invitation;
import com.f4.letparty.server.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Dang on 1/7/2017.
 */
public interface InvitationRepository extends JpaRepository<Invitation, Integer> {
    @Query("select u from Invitation u where u.host_id = :id")
    List<Invitation> findById(@Param("id") int id);

    @Query("select u from Invitation u, Guest_List g where g.id.guest_id = :id AND u.invitation_id = g.id.invitation_id")
    List<Invitation> findInvitedYouById(@Param("id") int id);
}
