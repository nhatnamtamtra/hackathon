package com.f4.letparty.server;

import com.f4.letparty.server.model.User;
import com.f4.letparty.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by bbphuc on 07/01/2017.
 */
@Controller
public class TestController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Collection<User> getMessage() {
        //return null;
        return userRepository.findAll();
    }

}
