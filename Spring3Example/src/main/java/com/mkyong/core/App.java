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
	}
	
	/*F#4 change for S24.1-101*/
	public static void supportingFunc() {
		System.out.println("Here comes avengers clip....., modifying this statement")
		if (x==y) {
			//then come home
		} else {
			//forget it
		}
	}
}
