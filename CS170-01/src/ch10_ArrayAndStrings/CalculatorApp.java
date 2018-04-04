package ch10_ArrayAndStrings;

import javax.swing.JOptionPane;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		try {
			calc.requestInput();
			calc.parseExpression();
			calc.compute("*", "/");
//			calc.compute("+", "-");
			JOptionPane.showMessageDialog(null, calc);
		} catch (NumberFormatException e) {
			System.out.println("The expression is wrong...\nPlease try again.");
		}
	}

}
