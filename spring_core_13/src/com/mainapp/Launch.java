package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ac=
				new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp1=(Employee) ac.getBean("emp");
		
		System.out.println(emp1.getDatabaseInfo().getClass());
		
		System.out.println(emp1);

	}

}
