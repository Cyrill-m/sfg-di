package by.mkstudio.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServices implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Property";
	}
}
