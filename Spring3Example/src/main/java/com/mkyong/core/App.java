package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		System.out.println("Committing this to master");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		//This comment is also part of Spring Story 1;
	}
}
