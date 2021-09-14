package by.mkstudio.sfgdi.controllers;

import by.mkstudio.sfgdi.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
