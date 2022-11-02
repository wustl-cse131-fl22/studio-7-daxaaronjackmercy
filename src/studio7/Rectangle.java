package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	
	}
	public double getArea() {
		
		return length * width;	
	}
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	public boolean compareArea(Rectangle other) {
		if (getArea()>other.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSquare() {
		if (length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	public void draw() {
		StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
	}
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle(.1,.1); 
		Rectangle r2 = new Rectangle(.2,.3);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.compareArea(r2));
		System.out.println(r1.isSquare());
		r1.draw();


	}

}

