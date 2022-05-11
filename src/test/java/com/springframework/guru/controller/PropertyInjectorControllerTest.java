package com.springframework.guru.controller;

import com.springframework.guru.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {


    private PropertyInjectorController propertyInjectorController;

    @BeforeEach
    void setup() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingServices = new ConstructorGreetingServicesImpl();
    }


    @Test
    void toTestGreetingService() {
        System.out.println(propertyInjectorController.getGreetring());
    }

}