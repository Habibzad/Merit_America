package com.coffeeshop;

public class EmployeeView {
	public static void main(String[] args) {
		displayEmployeeDetails();
	}
	public static void displayEmployeeDetails() {
		EmployeeController ec = new EmployeeController(new Employee("John", "Doe", "Accountant", 3000));
		System.out.println(ec.getEmployeeName(0));
	}

}
