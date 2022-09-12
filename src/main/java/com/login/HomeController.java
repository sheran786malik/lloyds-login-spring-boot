package com.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController { //our rest controller class is where the clients request directly comes to when made from the front end

    @GetMapping("/home")//a mapping to a /home url address gives the following function as a result
    public String home(){
        return "Logged In Successfully";
    }

    @GetMapping("/admin")//a mapping to a /home url address gives the following function as a result
    public String admin(){
        return "Admin Logged In Successfully";
    }
}
