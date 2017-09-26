package com.edu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Anilmal {
	@PostConstruct
      public void  inital(){
    	  System.out.println("*--------@PostConstruct-----*");
      }
	@PreDestroy
      public void  close(){
      	  System.out.println("*--------@PreDestroy---------*");  
      }
}
