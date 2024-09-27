package com.mainapp;

import java.util.List;

public class Google 
{
	private int id;
	private String headOffice;
	private List<String> listOfServiceCountry;
	
	
	public Google(int id, String headOffice, List<String> listOfServiceCompany) 
	{
		super();
		this.id = id;
		this.headOffice = headOffice;
		this.listOfServiceCountry = listOfServiceCompany;
	}


	@Override
	public String toString() 
	{
		return "Meta [id=" + id + ", headOffice=" + headOffice + ", listOfServiceCompany=" + listOfServiceCountry + "]";
	}



}
