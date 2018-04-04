import java.util.*;
import javax.swing.*;

public class ThrowExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 0.0;
		
//		//Use throw to handle invalid double data
//		try {
//			System.out.println("Enter a price: ");
//			if (sc.hasNextDouble()) {
//				price = sc.nextDouble();
//			} else {
//				throw new InputMismatchException("Invalid Price Entry. Please enter a double");
//			}
//		} catch (InputMismatchException e) {
//			System.out.println(e);
//		}
		
		
		//Use throw to handle the data out of range exception
		String ageString = "";
		int age = 0;
		
		try {
			ageString = JOptionPane.showInputDialog("Please enter your age: ");
			age = Integer.parseInt(ageString);
			if (age < 0) {
				throw new Exception("Age is less than 0 error! Please try again.");
			} else if (age > 199) {
				throw new Exception("Age is more than 199 error! Please try again");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
