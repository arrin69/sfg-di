package com.springframework.guru.controller;


import com.springframework.guru.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Controller
public class I18nController {

    private final GreetingServices greetingServices;

    public I18nController(@Qualifier("i18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayGreeting() {
        System.out.println(this.greetingServices.sayGreeting());
        return this.greetingServices.sayGreeting();
    }
}
