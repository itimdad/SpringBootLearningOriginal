package com.mainapp;

public class Employee 
{
	private Account account;
	
	public Employee()
	{
		
	}
	
	public Employee(Account account) 
	{
		this.account=account;
		
	}  //constructor dependency injection 
	
	
	
	public void setAccount(Account account) 
	{
		this.account = account;
	} //setter dependency injection



	public void PrintDetails()
	{
		account.accountInfo();
		
	}

}
