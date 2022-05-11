package com.springframework.guru;

import com.springframework.guru.controller.I18nController;
import com.springframework.guru.controller.MyController;
import com.springframework.guru.controller.PropertyInjectorController;
import com.springframework.guru.controller.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DIApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DIApplication.class, args);
        System.out.println(Arrays.toString(context.getEnvironment().getDefaultProfiles()));
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());;
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.helloWorld());

        PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
        System.out.println(propertyInjectorController.getGreetring());

        SetterBasedController setterBasedController = (SetterBasedController) context.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreetingServices().sayGreeting());
    }
}
