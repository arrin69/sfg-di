package com.springframework.guru.controller;

import com.springframework.guru.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    @Autowired
    private GreetingServices greetingServices;

    public GreetingServices getGreetingServices() {
        return greetingServices;
    }

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
}
