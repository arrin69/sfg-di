package com.springframework.guru.controller;

import com.springframework.guru.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {
    @Autowired public GreetingServices greetingServices;

    public String getGreetring() {
        return this.greetingServices.sayGreeting();
    }
}
