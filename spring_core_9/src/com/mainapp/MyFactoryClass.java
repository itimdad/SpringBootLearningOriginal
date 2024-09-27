package com.mainapp;

public class MyFactoryClass 
{
	//Bean Instantiation-->using Factory class
	
	public  Employee getObj()
	{
		System.out.println("Busi-LOGIC");
		return new Employee();
		
	}

}
