package com.paypal;

public class Triangle extends Shape {

	protected Point p1;
	protected Point p2;
	protected Point p3;
	
	public Triangle(String colour, Point p1, Point p2, Point p3) {
		super(colour);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle with points " + p1 + ", " + p2 + " and " + p3;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Triangle between " + this.p1 + ", " +
				this.p2 + " and " + this.p3 + " in " + this.colour + " colour");
	}
	
	
	
}
