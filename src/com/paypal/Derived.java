package com.paypal;

public class Derived extends Base {

	public void f() {
		System.out.println("Derived class f() called...");
//		System.out.println("Derived::pri => " + this.pri);
		System.out.println("Derived::pri => " + this.getPri());
		System.out.println("Derived::pro => " + this.pro);
		System.out.println("Derived::pub => " + this.pub);
	}
	
	public void h() {
		System.out.println("Derived::h() called");
	}
}
