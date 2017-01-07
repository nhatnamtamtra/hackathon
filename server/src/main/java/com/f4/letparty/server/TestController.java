package com.f4.letparty.server;

import com.f4.letparty.server.model.User;
import com.f4.letparty.server.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by bbphuc on 07/01/2017.
 */
@Controller
public class TestController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    com.f4.letparty.server.repository.InvitationRepository invitationRepository;
    @Autowired
    Guest_ListRepository guest_listRepository;
    @Autowired
    Friend_ListRepository friend_listRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Collection<User> getMessage() {
        //return null;
        return userRepository.findAll();
    }
}
