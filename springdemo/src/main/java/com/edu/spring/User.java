package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//发布一个bean，往spring容器装配，但是无法指定初始化没有明确角色的时候
@Component("myUser")//也可以在此注解里面指定方法名字

public class User {
   @Autowired//自动依赖注入
	private  UserService  userservice;

@Override
public String toString() {
	return "User [userservice=" + userservice + "]";
}
	

}
