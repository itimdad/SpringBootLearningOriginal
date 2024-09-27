package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String args[])
	{
		// TODO Auto-generated constructor stub
		
		ClassPathXmlApplicationContext ac=
				new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp1=(Employee)ac.getBean("emp");
		
		emp1.info();
		
		ac.close();
		
	
	}

}
