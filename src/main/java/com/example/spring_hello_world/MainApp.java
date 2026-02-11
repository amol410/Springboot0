package com.example.spring_hello_world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// 1. Load the XML configuration into the Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

		// 2. Ask the container for the bean by its ID
		GreetingService service = (GreetingService) context.getBean("myBean");

		// 3. Use the object
		service.sayHello();
	}
}

// ClassPath --->> Resources folder me search krna