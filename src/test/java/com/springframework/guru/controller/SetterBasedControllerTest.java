package com.springframework.guru.controller;

import com.springframework.guru.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    private SetterBasedController setterBasedController;

    @BeforeEach
    void setup() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingServices(new ConstructorGreetingServicesImpl());
    }


    @Test
    void totestSetterController() {
        System.out.println(setterBasedController.getGreetingServices().sayGreeting());
    }

}