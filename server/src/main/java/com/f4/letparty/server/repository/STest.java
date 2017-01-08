package com.f4.letparty.server.repository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Dang on 1/7/2017.
 */
@Controller
public class STest {
    @RequestMapping(path = "/shit")
    @ResponseStatus
    public String as(){
        return "Hello";
    }
}
