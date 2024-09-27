package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch 
{
	public static void main(String args[])
	{
		//Employee mp=new Employee();  tight coupling
		
		
		
		//lose coupling f
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("bean.xml");
	
//		Employee emp=  (Employee) ac.getBean("emp");
		
	
	}

}
