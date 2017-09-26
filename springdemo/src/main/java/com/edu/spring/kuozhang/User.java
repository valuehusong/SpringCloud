package com.edu.spring.kuozhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class User {
	@Autowired
    private  ApplicationContext  applicationcontext;
    
	public void init(){
		System.out.println("user 开始 init");
	}
    public  void show(){
    	System.out.println("user: "+applicationcontext.getClass());
    }
    
    
}
