package com.paypal;

public class Line extends Shape {
	
	protected Point p1;
	protected Point p2;
	
	public Line(String colour, Point p1, Point p2) {
		super(colour);
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Line from " + this.p1 + " to " + this.p2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line from " + this.p1 + " to " + 
				this.p2 + " in " + this.colour + " colour");
	}
	
	
}
