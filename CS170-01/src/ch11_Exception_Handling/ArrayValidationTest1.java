package ch11_Exception_Handling;

import java.util.*;

public class ArrayValidationTest1 {
	public static void main(String[] args) {
		
		String choice = "y";
		int count = 0;
		int size = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (choice.equals("y")) {
			try {
				System.out.print("Please enter an integer foor the size of array: ");
				 
				size = sc.nextInt();	//May throw InputMismatchException
				int[] intArray = new int[size];	//May throw NegativeArraySizeException
				System.out.println();
				
				ArrayDemo.fillArray(intArray);
				Arrays.sort(intArray);
				ArrayDemo.display(intArray);
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer for array");
				count++;	//Increase count variable
				sc.nextLine();	//Clear the buffer from any incorrect inputs
				continue;	//Re start the while loop
			} catch (NegativeArraySizeException e) {
				System.out.println("You must enter a positive integer for array size.");
				count++;	//Increase count variable
				sc.nextLine();		//Clear buffer
				continue;	//Restart the loop
			} finally {
				if (count >= 3) {
					System.out.println("The application is terminated now due to 3 times wrong entries...");
					System.out.println("Review your entries and try the program again");
					break;		//Terminate the loop
				}
			}
			
			System.out.print("Continue? (y/n");
			choice = sc.next();
		}
	}

}
