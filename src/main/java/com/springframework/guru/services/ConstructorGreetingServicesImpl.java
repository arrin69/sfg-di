package com.springframework.guru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "hello world";
    }
}
