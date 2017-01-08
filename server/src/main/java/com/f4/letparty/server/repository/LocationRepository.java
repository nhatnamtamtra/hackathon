package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dang on 1/7/2017.
 */
public interface LocationRepository  extends JpaRepository<Location, Integer> {
}
