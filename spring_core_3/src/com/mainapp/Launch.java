package com.mainapp;


import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Launch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);  
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println("Enter key");
		int key=sc.nextInt();
		
		Employee emp=(Employee) ac.getBean("emp");
		emp.info();
		
		Manager mg= (Manager) ac.getBean("man");
		mg.info();
		
		
		if(key==4043)
		{
			//student
			Student st=(Student) ac.getBean("std");
			
			st.info();
			
			
		}
		else
		{
			System.out.println("wrong input");
			
		}
		

		
	
	}

}
