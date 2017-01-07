package com.f4.letparty.server.repository;

import com.f4.letparty.server.model.Guest_List;
import com.f4.letparty.server.model.GuestListPK;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by Dang on 1/7/2017.
 */
public interface Guest_ListRepository extends JpaRepository <Guest_List, GuestListPK>{
}
