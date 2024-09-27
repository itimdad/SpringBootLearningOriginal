package com.mainapp;



//core java dependency injection


public class Launch 
{
	public static void main(String args[])
	{
		
		Account account =new Account();
		
		Employee emp=new Employee();
		
		emp.setAccount(account);
		
		emp.PrintDetails();
		
	}

}
