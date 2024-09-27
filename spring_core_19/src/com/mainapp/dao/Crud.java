package com.mainapp.dao;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import com.mainapp.dto.EmployeeDTO;
import com.mainapp.model.Employee;

public class Crud 
{
	private List<Employee> list;
	
	@PostConstruct
	public void MyCrudInit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("P1->ArrayList\nP2->LinkedList");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			list = new ArrayList<Employee>();
			
		}
		
		else
		{
			list = new LinkedList<Employee>();
		}
	}
	public void saveMyData(EmployeeDTO dto)
	{
		
		Employee employee= new Employee(dto.getEid(), dto.getEname(),dto.getEaddress() ,dto.getEsalaray());
		
		list.add(employee);
		
		System.out.println("Data inserted");
		
	}
	
	public List<Employee> ReadMyData(EmployeeDTO dto)
	{
		return list;
		
	}

}
