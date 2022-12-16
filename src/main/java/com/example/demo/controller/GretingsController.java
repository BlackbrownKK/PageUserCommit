package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class GretingsController {
    private final List<User> users = new ArrayList<>() {
        {
            add(User.builder().name("Roma").age(23).build());
            add(User.builder().name("Kate").age(13).build());
            add(User.builder().name("Vlad").age(18).build());
        }
    };

    @RequestMapping(value = "/page", method = RequestMethod.GET)
public String getHelloPage(){
        return "hello";
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
//    public String getMessage(){
    public @ResponseBody String getMessage(){
        return "hello from server!";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUserPage (Model model){
        model.addAttribute("users", users);
        return "users";
    }
}
