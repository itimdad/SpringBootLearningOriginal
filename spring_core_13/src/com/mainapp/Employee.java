package com.mainapp;
import java.util.List;

//collection string injection through setter using XML 

public class Employee
{
 private Account account;
 private String url;
 private List<String> databaseInfo;
 
 
public Account getAccount() 
{
	return account;
}
public void setAccount(Account account) 
{
	this.account = account;
}

public String getUrl() 
{
	return url;
}
public void setUrl(String url) 
{
	this.url = url;
}


public List<String> getDatabaseInfo() 
{
	return databaseInfo;
}
public void setDatabaseInfo(List<String> databaseInfo) 
{
	this.databaseInfo = databaseInfo;
	
}
@Override
public String toString() {
	return "Employee [account=" + account + ", url=" + url + ", dataTransfer=" + databaseInfo + "]";
}
 
 
}
