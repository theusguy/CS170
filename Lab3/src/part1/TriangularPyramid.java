package part1;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: TriangularPyramid business class which is a subclass of Triangle
*********************************************************************************/
public class TriangularPyramid extends Triangle{

//	public TriangularPyramid() {
//		super();
//	}
	
	public TriangularPyramid(int side) {
		super(side);
	}
	
	public double getArea() {
		return super.getArea() * 4;
	}
	
	public String toString() {
		return super.toString(); 
	}
}
