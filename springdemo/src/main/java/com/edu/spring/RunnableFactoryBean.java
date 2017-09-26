package com.edu.spring;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep>{
    //获取它的实例对象
	@Override
	public Jeep getObject() throws Exception {
		// TODO Auto-generated method stub
		return  new Jeep();
	}
    //获取它的实例对象类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Jeep.class;
	}
    //是否单例，默认不是的
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
