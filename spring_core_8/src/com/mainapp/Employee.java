package com.mainapp;

public class Employee 
{

	//Bean Instantiation-->using static Factory method
	private Employee() 
	{
		// TODO Auto-generated constructor stub
	
		System.out.println("Bean Instatiation");
	}
	
	public static Employee getObj()
	{
		System.out.println("BuSINESS- LOgic");
		return new   Employee();
	}
	
	public void info()
	{
		System.out.println("CUSTOM METHOD "); 
		
	}

}
