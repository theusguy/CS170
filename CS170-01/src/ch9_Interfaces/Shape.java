package ch9_Interfaces;

public abstract class Shape implements Cloneable{
	protected double x1, y1, x2, y2;
	
	//Default constructor
	public Shape() {
		x1 = y1 = x2 = y2 = 0;
	}
	//Overloaded Constructor with all instances as parameters
	public Shape(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	//Overriding toString from Object class to specifically
	public String toString() {
		String message = "(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")\n";
		return message;
	}
	
	//Implemented clone() from Cloneable interface
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//Abstract methods that need to be implemented upon 
	//first class in hierarchy
	public abstract void computeArea();
	public abstract void computeVolume();
	public abstract double getArea();
	public abstract double getVolume();
}
