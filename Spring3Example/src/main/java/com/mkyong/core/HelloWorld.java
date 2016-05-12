package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	//developing new functionality in dev branch
	private String careerPath;
	//Developing Sprint Story 2, will span for a week
	private String age;
	
	public void setAge(String age) {
		this.age=age;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setCareerPath(String cPath) {
		careerPath=cPath;
	}
	
	public void setName(String name) {
		System.out.println("Fixing issue in master");
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Good Morning ! " + name);
	}
}