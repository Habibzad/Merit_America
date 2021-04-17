package com.coffeeshop;

public class Employee {
	private static int idGen = 0;
	private int id;
	private String firstName;
	private String lastName;
	private String title;
	private double salary;
	
	//Constructor
	public Employee(String firstName, String lastName, String title, double salary) {
		setId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.salary = salary;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = idGen++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//ToString Method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", salary=" + salary + "]";
	}
}
