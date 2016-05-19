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
	//Developing Sprint Story4
	private double salary;	
	//Developing Sprint5... nw lets see how merge takes place
	//Developing Sprint3
	private String department;
	//Adding one more attribute as part of F#3, s103
	
	//wow this is change from hsuser3
	//here u come hsuser4 change
	
	//Testing 222708 commit for hsuser3 1:38
	
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
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public String getDepartment() {
		System.out.println("Fixing department code");
		return department;
	}
}