package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee 
{
	
	//bean life cycle using Annotation;
	static
	{
		System.out.println("BEAN LOADING  ");
		
	}
	 private Employee()
    {
		// TODO Auto-generated constructor stub
		System.out.println("BEAN INSTATIATION");
		
	}
	 @PostConstruct
	 public void  myXmlinit()
	 {
		 
		 System.out.println("Resource allocation; init ");
		 
	 }
	 
	public void info()
	{
		
		System.out.println("custom method ");
		
	}
	
	@PreDestroy
	public void  myXmlDestroy()
	{
		
		System.out.println("Resource De allocatio; destroye");
		
	}
	

}
