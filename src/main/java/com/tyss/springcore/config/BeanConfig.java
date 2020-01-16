package com.tyss.springcore.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tyss.springcore.beans.BeanFactoryPostProcesserClass;
import com.tyss.springcore.beans.BeanPostProcesserClass;
import com.tyss.springcore.beans.Cat;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

/**
 * This is a configuration class for the spring
 * To make the class as configuration class we have to annotate with @Configuration
 * To create a bean object using spring we have to create a factory method with @Bean annotation
 * We can give scope for the Bean using @Scope
 * 
 * @author Giridhara
 *
 */
@Configuration
public class BeanConfig {
	@Bean("hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMessage("I Love Python");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		hello.setMap(map);
		return hello;
	}
	
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("sandy");
//		pet.setAnimal(getDog());
		return pet;
	}
	
	@Bean("beanFactoryPostProcesser")
	public BeanFactoryPostProcesserClass getBeanFactoryPostProcessor() {
		return new BeanFactoryPostProcesserClass();
	}
	
	@Bean("beanPostProcesser")
	public BeanPostProcesserClass getBeanPostProcesserClass() {
		return new BeanPostProcesserClass();
	}
}
