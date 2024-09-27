package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class Employee implements InitializingBean, DisposableBean {

	// TODO Auto-generated constructor stub
	
	//Bean life cycle using callback interface;
	
		static
		{
			System.out.println("Bean Loading ");
		}
		
		private Employee()
		{
			System.out.println("BEAN INSTATIATION");
		}
		
		@Override
		public void afterPropertiesSet() throws Exception 
		{
			// TODO Auto-generated method stub
			System.out.println("Resource allocation init ");
			
		}
		
		public void info()
		{
			System.out.println("CUSTOM METHOD ");
		}




		@Override
		public void destroy() throws Exception
		{
			// TODO Auto-generated method stub
			System.out.println("Resource De allocation : Destroy");
			
		}
	

}
