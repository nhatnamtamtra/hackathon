package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bbphuc on 07/01/2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
