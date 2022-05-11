package com.springframework.guru.controller;

import com.springframework.guru.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedGreetingController {

    private final GreetingServices greetingServices;

    public ConstructorInjectedGreetingController(@Qualifier("constructorGreetingServicesImpl") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return this.greetingServices.sayGreeting();
    }
}
