package com.rkay.demo.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	private String name;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Constructor
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// toString method to represent Employee object as a string
	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", id=" + id + '}';
	}

	// Example of equals and hashCode methods (for object comparison)
	// You can generate these methods in IDEs like IntelliJ IDEA or Eclipse
	// For simplicity, I'm not implementing them here manually

}
