package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Dang on 1/7/2017.
 */
public interface LocationRepository  extends JpaRepository<Location, Integer> {
    @Query("select u from Location u where u.location_id = :id")
    List<Location> findById(@Param("id") int id);
}
