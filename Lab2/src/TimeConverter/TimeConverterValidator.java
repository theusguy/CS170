/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/4)
Brief Description: Utility class used to validate data inputed from user before
passing it to TimeConverter Object. Purpose is to handle exceptions and input 
errors that can be produced.
*********************************************************************************/

package TimeConverter;
import java.util.Scanner;

public class TimeConverterValidator {
	private static int min = 1;
	
	public static int timeCheck(Scanner sc, String prompt) {
		int time = 0;
		boolean isValid = false;
		
		while (!isValid) {
			try {
				System.out.println(prompt);
				if (!sc.hasNextInt()) {
					if (sc.next().equalsIgnoreCase("n")) {
						return -1;
					}
					throw new NumberFormatException();
				} else {
					//Why can't we declare time here? Oh is it because its not initialized here by default???
//					int time = sc.nextInt();
					
					time = sc.nextInt();
					
					//Testing data to be valid positive number
					if (time < min) {
						throw new Exception();
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("\nData Input Error. Please enter an integer!");
				sc.nextLine();
				continue;
			} catch (Exception e) {
				System.out.println("\nData Range Error. Must be a positive integer!");
				sc.nextLine();
				continue;
			}
			
			//After completing without any exceptions, we break the loop
			
			isValid = true;
		} //end while
		
		return time;
	}
}
