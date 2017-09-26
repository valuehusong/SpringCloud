package com.edu.spring.kuozhang;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class Book implements ApplicationContextAware{
    
	private  ApplicationContext  context;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		        this.context=context;
	}
	
     public  void show(){
    	 System.out.println("book:" +context.getClass());
     }
}
