package by.mkstudio.sfgdi.controllers;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import by.mkstudio.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
