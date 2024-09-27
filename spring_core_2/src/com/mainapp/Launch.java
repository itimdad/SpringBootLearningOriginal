package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class Launch 
{
	public static void main(String args[])
	{
		
		 // 1. Load the bean.xml file from the classpath
		
        Resource resource = new ClassPathResource("bean.xml");
        
        
        // 2. Create an XmlBeanFactory and give it the resource (bean.xml)
        
        XmlBeanFactory xml = new XmlBeanFactory(resource);
        
        
        // 3. Get the bean named "emp" from the XmlBeanFactory and cast it to an Employee object
        
        Employee employee = (Employee) xml.getBean("emp"); 
        
        Manager manager=(Manager) xml.getBean("man");
        
        Student student=(Student) xml.getBean("std");
		
	}

}
