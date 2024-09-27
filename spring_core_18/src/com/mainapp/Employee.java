package com.mainapp;
import java.util.List;

public class Employee 
{
 //autowiring byconstructor
	
    private Account  accinfo;
    private Car car;
    private List<String> listOfBooks;
    
	
	

	public Employee(Account accinfo, Car car, List<String> listOfBooks) 
	{
		super();
		this.accinfo = accinfo;
		this.car = car;
		this.listOfBooks = listOfBooks;
	}




	@Override
	public String toString() {
		return "Employee [ accinfo=" + accinfo + ", car=" + car + ", listOfBooks=" + listOfBooks + "]";
	}
    
    
	
	
}
