/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/4)
Brief Description: Driver class that runs the TimeConverter program to prompt 
user for data. It then validates the code and then saves it in TimeConverter
Object for organization.
*********************************************************************************/

package TimeConverter;
import java.util.Scanner;

public class TimeConverterApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimeConverter time = new TimeConverter();
		
		int weeks, days, hours, minutes, seconds;
		
		String choice = "y";
		
		outerloop:
		while (choice.equalsIgnoreCase("y")) {
			hours = TimeConverterValidator.timeCheck(sc, "Please enter number of hours");
			if (hours == -1) {
				System.out.println("Program terminated.");
				break outerloop;
			} else {
				time.setHours(hours);
			}
			
			minutes = TimeConverterValidator.timeCheck(sc, "Please enter number of minutes");
			if (minutes == -1) {
				System.out.println("Program terminated.");
				break outerloop;
			} else {
				time.setMinutes(minutes);
			}
			
			seconds = TimeConverterValidator.timeCheck(sc, "Please enter number of seconds");
			if (seconds == -1) {
				System.out.println("Program terminated.");
				break outerloop;
			} else {
				time.setSeconds(seconds);
			}
			
			System.out.println("Week(s): " + time.getWeeks());
			System.out.println("Day(s): " + time.getDays());
			System.out.println("Hour(s): " + time.getHours());
			System.out.println("Minute(s): " + time.getMinutes());
			System.out.println("Second(s): " + time.getSeconds() + "\n");
			
			//Reseting Days and Weeks since they don't have reset functionality from TimeConverter
			time.resetDays();
		}
		
	}

}
