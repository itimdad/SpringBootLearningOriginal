package com.mainapp;

public class Employee 
{
	private int eid;
	private String ename;

	public void setEid(int eid) {
		this.eid = eid;
	}

	
	public void setEname(String ename) {
		this.ename = ename;
	}
	 private Employee()
    {
		// TODO Auto-generated constructor stub
		System.out.println("emp instan");
		
	}
	public void info()
	{
		
		System.out.println("emp infor--->>>");
		System.out.println("EID="+eid);
		System.out.println("Ename="+ename);
		
	}
	

}
