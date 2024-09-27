package com.mainapp;

public class Employee 
{
	private Account account;
	private String url;
	

	

	//Setter injection using Xml

	public void setAccount(Account account) 
	{
		this.account = account;
		
	}
	
	public void setUrl(String url)
	{
		this.url=url;
	}





	public void PrintDetails()
	{
		account.accountInfo();
		System.out.println(url);
		
	}

}
