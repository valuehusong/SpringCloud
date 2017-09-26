package com.edu.spring.kuozhang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.spring.kuozhang");
		context.getBean("user", User.class).show();
		context.getBean(Book.class).show();
		context.getBean(Bank.class).show();
	

		context.close();
	}
}
