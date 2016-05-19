package com.mkyong.service;


public class PersonService {
	
	@Webservice
	public Account getAccountDetails(String accountNo) {
		//Connect to Database and extract account details
		PersonDatabase perDB = new PersonDatabase();
		perDB.setSalary(22222);
		//come on add functionality over here
		List results = perDB.findAccount(accountNo);
		//Iterate loop and store account
		//OMG what an issue lets fix it., redo
		//added salary, add one more && condition
		//consider calculation of salary
		//fix this defect
		return account;		
	}
}
