package com.tyss.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * First phase of the bean life cycle where the postProcesserBeanFactory method
 * will execute before creating any bean object
 * This class has to be configured as bean to execute the method
 * @author Giridhara
 *
 */
public class BeanFactoryPostProcesserClass implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcesserClass");
	}

}
