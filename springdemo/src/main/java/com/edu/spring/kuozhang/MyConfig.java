package com.edu.spring.kuozhang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
   @Bean
	public User createUser(){
		return new User();
	}
	// @Bean
	// public Book CreateBook(){
	// return new Book();
	// }

}
