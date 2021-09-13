package com.paypal;

public abstract class Employee {
	
	protected String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public abstract void printPayroll();
}
