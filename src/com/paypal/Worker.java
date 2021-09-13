package com.paypal;

public class Worker extends Employee {

	protected int hourlyRate;
	protected int hoursWorked;
	
	public Worker(String name, int hourlyRate, int hoursWorked) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void printPayroll() {
		// TODO Auto-generated method stub
		System.out.println("Worker - " + this.name);
		System.out.println("Amount Payable: " + (this.hourlyRate*this.hoursWorked));
	}
}
