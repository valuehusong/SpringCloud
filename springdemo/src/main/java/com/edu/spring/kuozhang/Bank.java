package com.edu.spring.kuozhang;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	private ApplicationContext context;

	public Bank(ApplicationContext context) {
		this.context = context;
	}

	public void show() {
		System.out.println("bank: " + context.getClass());
	}
}
