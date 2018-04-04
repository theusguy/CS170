/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/20)
Brief Description: Driver Class(App). Runs the program and prompts user for
starting and ending number of the table.
*********************************************************************************/

import java.util.Scanner;

public class NestedLoopApp {

	public static void main(String[] args) {
		//Instantiating SquareCubeTable and Scanner objects
		SquareCubeTable table = new SquareCubeTable();
		Scanner scan = new Scanner(System.in);
		
		//Prompting user for starting number
		System.out.println("Please enter starting number");
		int start = scan.nextInt();
		
		//Prompting user for ending number
		System.out.println("Please enter ending number");
		int end = scan.nextInt();
		
		//Printing the title of table
		table.tableTitle();
		//Printing out the data of the table
		table.tableData(start, end);
	}

}
