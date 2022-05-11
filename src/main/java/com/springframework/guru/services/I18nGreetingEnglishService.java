package com.springframework.guru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nGreetingEnglishService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "hi there - engels";
    }
}
