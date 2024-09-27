package com.mainapp.dto;

public class EmployeeDTO 
{

	//Data binding  by which we can transfer data to one class to another
	private int eid;
	private String ename;
	private int eaddress;
	private int esalaray;
	public EmployeeDTO(int eid, String ename, int eaddress, int esalaray) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalaray = esalaray;
	}
	
	public int getEid() 
	{
		return eid;
	}
	
	public String getEname() 
	{
		return ename;
	}
	
	public int getEaddress() 
	{
		return eaddress;
	}
	
	public int getEsalaray() 
	{
		return esalaray;
	}
	
	
}
