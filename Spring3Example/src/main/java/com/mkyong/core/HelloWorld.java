package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	//developing new functionality in dev branch
	private String careerPath;
	
	public void setCareerPath(String cPath) {
		careerPath=cPath;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Good Morning ! " + name);
	}
}