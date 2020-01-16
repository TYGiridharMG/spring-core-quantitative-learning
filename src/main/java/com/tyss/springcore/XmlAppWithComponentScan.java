package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Hello;

/**
 * {@link Hello} will be created by @Component and context:component-scan
 * We can create any number of Bean by @Component and get the object here 
 * @author Giridhara
 *
 */
public class XmlAppWithComponentScan {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getMap());
		context.close();
	}
}
