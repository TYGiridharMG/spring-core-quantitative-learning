package com.tyss.springcore.beans;

/**
 * One of the implementation class
 * for {@link Animal} interface
 * @author Giridhara
 *
 */
public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meaoooooo");
	}
}
