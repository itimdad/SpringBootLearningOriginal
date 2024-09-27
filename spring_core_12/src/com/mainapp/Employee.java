package com.mainapp;

public class Employee 
{
	private Account account;
	private String url;
	
//constructor injection using Xml
	public Employee(Account account,String url)
	{
		this.account=account;
		this.url=url;
		
	}
	
	
	


	public void PrintDetails()
	{
		account.accountInfo();
		System.out.println(url);
		
	}

}
