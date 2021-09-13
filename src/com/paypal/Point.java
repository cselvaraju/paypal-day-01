package com.paypal;

public class Point extends Shape {
	protected int x;
	protected int y;
	
	public Point(String colour, int x, int y) {
		super(colour);
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point(" + this.x + ", " + this.y + ")";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing point (" + this.x + ", " + this.y + ") in " +
		this.colour + " colour");
	}
	
	
	
}
