package com.springframework.guru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hola in espana";
    }
}
