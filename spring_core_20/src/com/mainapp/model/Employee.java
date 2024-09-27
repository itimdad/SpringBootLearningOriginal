package com.mainapp.model;

public class Employee 
{
	private int eid;
	private String ename;
	private int eaddress;
	private int esalaray;
	
	
	
	
	public Employee(int eid, String ename, int eaddress, int esalaray) 
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
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public int getEaddress() 
	{
		return eaddress;
	}
	public void setEaddress(int eaddress) 
	{
		this.eaddress = eaddress;
	}
	public int getEsalaray() 
	{
		return esalaray;
	}
	public void setEsalaray(int esalaray) 
	{
		this.esalaray = esalaray;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalaray=" + esalaray + "]";
	}
	
	
	
	

}
