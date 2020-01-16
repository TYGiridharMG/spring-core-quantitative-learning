package com.tyss.springcore.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * This class is the first class we created as spring core example
 * 
 * It implements InitializingBean, DisposableBean for life cycle
 * 
 * It is annotated with @Component so that spring will create the object of this class as bean
 * 
 * @author Giridhara
 *
 */
@Component
public class Hello implements InitializingBean, DisposableBean {
	
	public Hello() {
		System.out.println("Hello Object created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
	
	private String message;
	private Map<String, Integer> map;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method");
	}
}
