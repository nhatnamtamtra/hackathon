package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by Dang on 1/7/2017.
 */
public interface InvitationRepository extends JpaRepository<Invitation, Integer> {
}
