package com.example.mikesherokudemo.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from heroku...";
    }

    @GetMapping("/goodevening")
    public String goodevening(){
        return "Goodevening from Mikes Channel.";
    }
}
