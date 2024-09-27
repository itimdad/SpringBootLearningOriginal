package com.mainapp.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mainapp.controller.MyController;
import com.mainapp.dao.Crud;
import com.mainapp.service.MyService;

public class BeanPostProcessorImpl implements BeanPostProcessor
{
	
	
	
     @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
       {
    	 
    	 if(bean instanceof Crud)
    	 {
    		 System.out.println("Crud bean INSTATIATed SUCCESFULLY");
    		 
    	 }
    	 
    	 else if(bean instanceof MyService)
    	 {
    		 System.out.println("My service Bean Instatantiated successfully");
    	 }
    	 
    	 else if(bean instanceof MyController)
    	 {
    		 System.out.println("MyController Bean Instatantiated successfully");
    		 
    		 
    	 }

	
			return bean;
		}	
    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
     {
    	
    	
    	
   	 
   	 if(bean instanceof Crud)
   	 {
   		 Crud crud = (Crud) bean;
   		 
   		 if(crud.getList()!=null)
   		 {
   			 
   			 System.out.println("Crud bean INitialized  SUCCESFULLY");
   		 }
   		 
   		 else
   		 {
   			 System.out.println("Crud ean Fail to initialized");
   		 }
   		 
   		 
   	 }
   	 
   	 else if(bean instanceof MyService)
   	 {
   		 System.out.println("My service Bean Initialized  successfully");
   	 }
   	 
   	 else if(bean instanceof MyController)
   	 {
   		 System.out.println("MyController Bean Initialized successfully");
   		 
   		 
   	 }

	       return bean;
      }


}
