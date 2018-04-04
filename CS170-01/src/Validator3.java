import java.util.Scanner;

public class Validator3 {
	public static double validateDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;
		sc.nextLine();		//Clear the buffer
		
		while(!isValid) {
			try {
				System.out.print(prompt);
				if (!sc.hasNextDouble()) {
					throw new NumberFormatException();
				} else {
					data = sc.nextDouble(); //Receive Double
					
					if (inRange(data)) {
						isValid = true;
					} else {
						throw new Exception();
					} //end inner if
				} //end outer if
			} catch (NumberFormatException e) {
				System.out.println("\nData input error. Please enter a decimal data...");
				sc.nextLine();		//Clear the buffer
			} catch (Exception e) {
				System.out.println("\nData input error. Please check the data and try again...");
				sc.nextLine();		//Clear the buffer
			}
		} //end while
		return data;
	} //end of validateDouble()
	
	//MEthod of validateInt() with range
	public static int validateInt(Scanner sc, String prompt, int min, int max) {
		boolean isValid = false;
		int data = 0;
		sc.nextLine();		//Clear the buffer
		while(!isValid) {
			try {
				System.out.print(prompt);
				if (!sc.hasNextInt()) {
					throw new NumberFormatException();
				} else {
					data = sc.nextInt();
					
					if (data < min) {
						throw new Exception();
					} else if (data > max) {
						throw new Exception();
					}
					
					isValid = true;
				} //end outer if/else 
			} catch (NumberFormatException e) {
				System.out.println("\nData input error. Please enter an integer...");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("\nInput data out of the range error. Please check the data and try again...");
				sc.nextLine();
			}
		} //end while
		return data;
	} //end of validateInt();
	
	//Method of inRange()
	private static boolean inRange(double num) {
		if (num >= 0.0) {
			return true;
		} else {
			return false;
		}
	} //end inRange

}
