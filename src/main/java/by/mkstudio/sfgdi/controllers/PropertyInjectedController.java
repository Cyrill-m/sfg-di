package by.mkstudio.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import by.mkstudio.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyGreetingServices")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
