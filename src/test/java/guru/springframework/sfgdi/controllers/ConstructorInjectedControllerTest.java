package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import by.mkstudio.sfgdi.controllers.ConstructorInjectedController;
import by.mkstudio.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}