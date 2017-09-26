package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class,User.class);
        System.out.println(context.getBean(MyBean.class) );//根据类型来寻找获取
      //  System.out.println(context.getBean("createbean") );//通过方法名字来寻找
        System.out.println(context.getBean("bean") );//通过bean注解里面特定的方法名字来寻找
        System.out.println(context.getBean(JeepFactory.class) );
        System.out.println(context.getBean(RunnableFactoryBean.class) );//类型
        System.out.println(context.getBean("&factorybean") );//类名
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Anilmal.class));
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBeansOfType(User.class));
        context.close();
    }
}
