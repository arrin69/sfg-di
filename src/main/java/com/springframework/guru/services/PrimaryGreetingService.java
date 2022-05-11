package com.springframework.guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "from promary";
    }
}
