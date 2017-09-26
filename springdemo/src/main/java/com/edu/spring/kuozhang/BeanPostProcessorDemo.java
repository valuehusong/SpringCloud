package com.edu.spring.kuozhang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor会在每个bean初始化的时候，调用一次
 * 两个方法不能返回null，否则从容器中获取不到
 * 这2个方法
 * 执行顺序postProcessBeforeInitialization-init -postProcessAfterInitialization
 * @author hasee
 *
 */
public class BeanPostProcessorDemo implements BeanPostProcessor {

	@Override
	//bean依赖装配（属性设置完）完成之后触发的
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("*-----------postProcessAfterInitialization------------------*");
		return bean;

	}
	
	//属性设置完了bean的init初始化完成在调用，除非你有需要bean为null，否则别设置null
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("*-------------postProcessBeforeInitialization----------------*");
		return bean;
	}

}
