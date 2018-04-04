import java.util.*;
import javax.swing.*;

public class TestValidationApp {
	public static void main(String[] args) {
		String str = "";
		double price = 0.0;
		int quantity = 0;
		boolean notDone = true;
		Scanner sc = new Scanner(System.in);
		
		while (notDone) {
			//Prompt user to enter a price
			System.out.println("Please enter a price: ");
			if (sc.hasNextDouble()) {
				price = sc.nextDouble();
			} else {
				sc.nextLine();
				JOptionPane.showMessageDialog(null, "Input error. Enter a price...");
				continue;
			}
			System.out.println("Please enter the quantity: ");
			if (sc.hasNextInt()) {
				quantity = sc.nextInt();
			} else {
				sc.nextLine();
				JOptionPane.showMessageDialog(null, "Input error. Enter a price..");
				continue;
			}
			System.out.println("Price is: " + price + " Quantity is: " + quantity);
		}
	}
}
