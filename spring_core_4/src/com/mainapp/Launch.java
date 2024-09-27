package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String args[])
	{
		// TODO Auto-generated constructor stub
		
		ClassPathXmlApplicationContext ac=
				new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp1=(Employee)ac.getBean("emp");
		
		emp1.setEid(100);
		emp1.setEname("imdad");
		
		emp1.info();
		
		 Employee emp2= (Employee) ac.getBean("emp");
		 
		 emp2.info();
	}

}
