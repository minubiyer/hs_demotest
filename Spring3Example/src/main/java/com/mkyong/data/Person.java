package com.mkyong.data;

import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private List<Account> accounts;
	//corrected datatype;
	private long salary;
	private transient calculatedSalary;
	//added by hsuser2
	private Digital enabled;
}
