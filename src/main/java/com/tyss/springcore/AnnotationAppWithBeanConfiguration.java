package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.BeanConfig;

/**
 * This is the test class where we are testing the configuration class whether
 * spring is creating bean objects using the configuration class or not
 * @author Giridhara
 *
 */
public class AnnotationAppWithBeanConfiguration {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getMap());
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello == hello2);
		System.out.println("**************************");
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		System.out.println("**************************");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		System.out.println("**************************");
		Pet pet1 = context.getBean(Pet.class);
		System.out.println(pet==pet1);
		System.out.println(pet.getAnimal() == pet1.getAnimal());
		
		context.close();
		
	}
}





