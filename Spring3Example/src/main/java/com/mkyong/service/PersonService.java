package com.mkyong.service;


public class PersonService {
	
	@Webservice
	public Account getAccountDetails(String accountNo) {
		//Connect to Database and extract account details
		PersonDatabase perDB = new PersonDatabase();
		List results = perDB.findAccount(accountNo);
		//Iterate loop and store account
		//added salary, update
		return account;		
	}
}
