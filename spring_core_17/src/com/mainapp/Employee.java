package com.mainapp;
import java.util.List;

public class Employee 
{
 //autowiring byType
	
    private Account  accinfo;
    private Car car;
    private List<String> listOfBooks;
    
	
	
	public Account getAccinfo() 
	{
		return accinfo;
	}
	
	public void setAccinfo(Account accinfo) 
	{
		this.accinfo = accinfo;
	}
	
	public Car getCar() 
	{
		return car;
	}
	
	public void setCar(Car car) 
	{
		this.car = car;
	}
	public List<String> getListOfBooks() 
	{
		return listOfBooks;
	}
	public void setListOfBooks(List<String> listOfBooks) 
	{
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [ accinfo=" + accinfo + ", car=" + car + ", listOfBooks=" + listOfBooks + "]";
	}
    
    
	
	
}
