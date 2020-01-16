package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

/**
 * This s a test class where we are testing the configuration xml file whether the 
 * spring is creating bean objects or not
 * @author Giridhara
 *
 */
public class XmlAppWithBeanConfiguration {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		
		System.out.println(hello.getMessage());
		
		System.out.println("*****************************");
		
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		
		System.out.println("*****************************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
	}
}
