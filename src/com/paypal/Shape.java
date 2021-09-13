package com.paypal;

public abstract class Shape {
	
	protected String colour;
	
	public Shape() {
		this.colour = "BLACK";
	}
	
	public Shape(String colour) {
		this.colour = colour;
	}
	
	public abstract void draw();
}
