package com.springframework.guru.controller;

import com.springframework.guru.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String helloWorld() {
        System.out.println("i ma here");
        System.out.println(this.greetingServices.sayGreeting());;
        return "hello pradeep";
    }
}
