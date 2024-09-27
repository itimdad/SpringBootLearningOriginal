package com.mainapp;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mainapp.controller.MyController;
import com.mainapp.dto.EmployeeDTO;

public class Launch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac =
				new ClassPathXmlApplicationContext("bean.xml");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid");
		int eid = sc.nextInt();
		
		System.out.println("Enter ename");
		String ename = sc.next();
		
		System.out.println("Enter eaddresss");
		String eaddress = sc.next();
		
		System.out.println("Enter esalary");
		int salary = sc.nextInt();
		
		//DTO model  <-- purpose of this to transfer the data 
		EmployeeDTO employeeDTO = new EmployeeDTO(eid, ename, eid, salary);
		
		
		//getting object of controller
		
		MyController controller = (MyController) ac.getBean("controller");
		
		controller.doPost(employeeDTO);
		
	
			
	}
}
