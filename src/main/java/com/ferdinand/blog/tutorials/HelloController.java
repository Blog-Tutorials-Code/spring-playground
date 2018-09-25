package com.ferdinand.blog.tutorials;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "test/users", method = RequestMethod.GET)
    public String getUsers(){
        return "Returning List of Usersv3";
    }

}
