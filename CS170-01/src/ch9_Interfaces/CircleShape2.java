package ch9_Interfaces;

public abstract class CircleShape2 extends Shape implements Printable {
	protected double radius;
	
	//Default Constructor
	public CircleShape2() {
		super();
	}
	
	//Overriden Constructor for coordinate points
	public CircleShape2(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}
	
	//Overriden Constructor passing radius as argument
	public CircleShape2(double radius) {
		this.radius = radius;
	}
	
	//Setter for radius instance var
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Getter for radius instance var
	public double getRadius() {
		return radius;
	}
	
	public void computeRadius() {
		radius = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	public String toString() {
		return super.toString() + "Radius: " + radius + "\n";
	}
	
	public void print() {
		System.out.println("radius: " + radius);
	}
	

}
