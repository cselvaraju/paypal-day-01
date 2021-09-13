package com.paypal;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point("RED", 10, 20);
//		System.out.println(p);
		p.draw();
		
		Line l = new Line("BLUE", new Point("BLUE", 0, 0), new Point("BLUE", 5, 10));
//		System.out.println(l);
		l.draw();
		
		Triangle t = new Triangle("GREEN", new Point("GREEN", 1, 1), new Point("GREEN", 5, 5), new Point("GREEN", 10, 3));
//		System.out.println(t);
		t.draw();
	}

}
