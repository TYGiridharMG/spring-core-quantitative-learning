package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * For wiring and autowiring we are using this class an example
 * @author Giridhara
 *
 */
public class Pet {
	
	public Pet() { }
	 
	public Pet(Animal animal) {
		this.animal = animal;
	}
	
	public Pet(String name) {
		this.name = name;
	}
	
	private String name;
	@Autowired
	@Qualifier("getDog")
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
