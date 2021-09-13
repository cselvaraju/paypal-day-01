package com.paypal;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Manager m = new Manager("ABCD", 15000, "Finance");
//		Worker w = new Worker("XYZ", 15, 30);
//		
//		m.printPayroll();
//		w.printPayroll();

//		Employee e;
//		e = new Manager("ABCD", 15000, "Finance");
//		e.printPayroll();
//		
//		e = new Worker("XYZ", 15, 30);
//		e.printPayroll();

//		Manager[] managers = {
//				new Manager("M-1", 15000, "Sales"),
//				new Manager("M-2", 22000, "HR")
//		};
//		
//		Worker[] workers = {
//				new Worker("W-1", 150, 25),
//				new Worker("W-2", 200, 20),
//				new Worker("W-3", 100, 15)
//		};
//		
//		// Printing the payroll
//		// Traditional way
//		
//		int i;
//		
//		for (i = 0; i < managers.length; ++i) {
//			managers[i].printPayroll();
//		}
//		
//		for (i = 0; i < workers.length; ++i) {
//			workers[i].printPayroll();
//		}
		
		// Polymorphic way
		
		Employee[] employees = {
				new Manager("M-1", 15000, "Sales"),
				new Manager("M-2", 22000, "HR"),
				new Worker("W-1", 150, 25),
				new Worker("W-2", 200, 20),
				new Worker("W-3", 100, 15)
		};
		
		for(int n = 0; n < employees.length; ++n) {
			employees[n].printPayroll();
		}
	}

}
