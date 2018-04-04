/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/20)
Brief Description: Class Blueprint containing methods that design the table.
*********************************************************************************/

public class SquareCubeTable {	
	
	//prints out the title (header) of the table
	public void tableTitle() {
		System.out.println("Number\tSquare\tCube");
	}
	
	//prints out the data (body) of the table
	public void tableData(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
		} //end for loop
	} //end tableData method
} //end class
