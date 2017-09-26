package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	   //如果不想根据这个方法名字来获取，也可以自己设置名字
        @Bean(name="bean")
        @Scope("prototype")
        public MyBean  createbean(){
		   return  new MyBean();
	   }
	   @Bean
        public RunnableFactoryBean factorybean(){
        	return  new  RunnableFactoryBean();
        }
	   @Bean
	   public JeepFactory createFactory(){
		   return new JeepFactory();
	   }
	   
   @Bean
	   public  Jeep createJeep(JeepFactory factory){
		   return   factory.createJeep();
	   }
   @Bean
   public  CarFactory createcarFactory(){
	   return new CarFactory();
   }
	@Bean
     public Car createCar(CarFactory factory){
    	 return  factory.createCar();
     }
	@Bean
	public  Cat createCat(){
		return new Cat();
	}
	@Bean(initMethod="init",destroyMethod="destory")
	public Dog createDog(){
		return new Dog();
	}
	@Bean
	public Anilmal  createAnimal(){
		return new Anilmal();
	}
	@Bean
	public UserDao createuserdao(){
		return new UserDao();
	}
	@Bean
	public UserService createuserservice(){
		return new UserService();
	}
}
