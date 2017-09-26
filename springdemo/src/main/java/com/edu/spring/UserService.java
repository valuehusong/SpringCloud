package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service //业务逻辑层
public class UserService {
    @Autowired
	private UserDao  userdao;

	@Override
	public String toString() {
		return "UserService [userdao=" + userdao + "]";
	}
	
    
}
