package com.coffeeshop;

public class EmployeeController {
	private Employee model;
	
	public EmployeeController(Employee employee) {
		this.model = employee;
	}
		
	//Get employee name
	public String getEmployeeName(int employeeID) {
		return this.model.getFirstName()+" "+model.getLastName();
	}
	
	//Get employee title
	public String getEmployeeTitle(int employeeID) {
		return this.model.getTitle();
	}
	
	//Update Employee's First Name
	public void updateEmployeeFirstName(String name) {
		model.setFirstName(name);
	}
	
	//Update Employee's Last Name
	public void updateEmployeeLastName(String name) {
		model.setLastName(name);
	}
	
	//Update EmployeeTitle
	public void updateEmployeeTitle(String title) {
		model.setTitle(title);
	}
	
	//Update Employee Salary
	public void updateEmployeeSalary(double salary) {
		model.setSalary(salary);
	}
	
}
