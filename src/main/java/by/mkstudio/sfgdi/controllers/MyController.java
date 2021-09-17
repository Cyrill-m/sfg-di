package by.mkstudio.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import by.mkstudio.sfgdi.services.PrimaryGreetingService;

@Controller
public class MyController {
	
	private final PrimaryGreetingService greetingService;
	
	public MyController(PrimaryGreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		//System.out.println("Hello World!!!");
		
		return greetingService.sayGreeting();
	}
}
