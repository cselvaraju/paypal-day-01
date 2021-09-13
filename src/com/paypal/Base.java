package com.paypal;

public class Base {
	private int pri;
	protected int pro;
	public int pub;
	
	public Base() {
		this.pri = 10;
		this.pro = 20;
		this.pub = 30;
	}
	
	public int getPri() {
		return this.pri;
	}
	
	public void f() {
		System.out.println("Base::f() called...");
		System.out.println("Base::pri => " + this.pri);
		System.out.println("Base::pro => " + this.pro);
		System.out.println("Base::pub => " + this.pub);
	}
	
	public void g() {
		System.out.println("Base::g() called");
	}
}
