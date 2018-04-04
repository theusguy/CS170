/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/20)
Brief Description: Kilograms and Pounds Converter Driver Class (App). Contains code 
to prompt user and print results.
*********************************************************************************/


import javax.swing.JOptionPane;

public class KiloToPoundsDriver {
	public static void main(String[] args) {
		//Instantiating KiloToPounds Object
		KiloToPounds converter = new KiloToPounds();
		
		//random variable value holders
		String str;
		boolean isItKilo = false;;
		boolean killProgram = false;
		
		//Running the Program 
		while (!killProgram) {
			
			//Prompt#1: Asking if kilos or lbs
			str = JOptionPane.showInputDialog("Welcome to the Weight Converter\n" + "Please Enter Unit of Measurement (\"kilo\" or \"lbs\"):");
			if (str.equalsIgnoreCase("lbs")) {
				isItKilo = false;
			} else if (str.equalsIgnoreCase("kilo")) {
				isItKilo = true;
			} else if (str.equals("n")) {
				killProgram = true;
				JOptionPane.showMessageDialog(null, "Program is terminated.", "Goodbye!", 1);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Oh, so you're a rebel, huh?\nCongrats, you broke the program", "Hacker Alert", 2);
				break;
			}
			
			//Prompt#2: Asking for the number
			str = JOptionPane.showInputDialog("Please enter a number");
			if (str.equals("n")) {
				killProgram = true;
				JOptionPane.showMessageDialog(null, "Program is terminated.", "Goodbye!", 1);
				break;
			}
			
			//Printing out the results
			if (isItKilo) {
				converter.setKilograms(str);
				JOptionPane.showMessageDialog(null, converter.getKilograms() + " kilograms = " + converter.getPounds() + " pounds");
			} else {
				converter.setPounds(str);
				JOptionPane.showMessageDialog(null, converter.getPounds() + " pounds = " + converter.getKilograms() + " kilograms");
			} //end else
		} //end while
	} //end main
} //end class
