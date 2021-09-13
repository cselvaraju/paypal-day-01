package com.paypal;

public class Manager extends Employee {
	
	protected int salary;
	protected String dept;
	
	public Manager(String name, int salary, String dept) {
		super(name);
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public void printPayroll() {
		// TODO Auto-generated method stub
		System.out.println("Manager - " + this.name);
		System.out.println("Salary: " + this.salary);
	}
}
