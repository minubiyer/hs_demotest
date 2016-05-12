package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		System.out.println("Fixing issue in master");
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Good Morning ! " + name);
	}
}