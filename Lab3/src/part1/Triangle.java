package part1;
import java.util.Scanner;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Business class Triangle acting as the superclass and storing 
Triangle data.
*********************************************************************************/

public class Triangle {
	protected int side;
	
//	public Triangle() {
//		this.side = 0;
//	}
	
	public Triangle(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		Scanner scan = new Scanner(System.in);
//		if (side < 0) {
//			System.out.println("Incorrect side length. Please enter a positive number.");
//			int newSide = scan.nextInt();
//			this.setSide(newSide);
//		} else {
			this.side = side;
//		}
	}
	
	public double getArea() {
		return (Math.sqrt(3)/4) * getSide() * getSide();
	}
	
	public String toString() {
		return "Side: " + this.getSide() + "         Area: " + this.getArea();
	}

}
