package com.tyss.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * This Class is for pre initialization phase and post initialization phase
 * in bean life cycle 
 * 
 * postProcessBeforeInitialization() method will be executed in pre initialization phase
 * 
 * postProcessAfterInitialization() method will be executed in post initialization phase
 * @author Giridhara
 *
 */
public class BeanPostProcesserClass implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + " before");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + " after");
		return bean;
	}
}
