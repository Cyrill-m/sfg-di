package by.mkstudio.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import by.mkstudio.sfgdi.controllers.ConstructorInjectedController;
import by.mkstudio.sfgdi.controllers.MyController;
import by.mkstudio.sfgdi.controllers.PropertyInjectedController;
import by.mkstudio.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		
		System.out.println("----- Property ------");
		PropertyInjectedController piController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(piController.getGreeting());
		
		System.out.println("----- Setter ------");
		SetterInjectedController siController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(siController.getGreeting());
		
		System.out.println("----- Constructor ------");
		ConstructorInjectedController ciController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(ciController.getGreeting());
	}

}
