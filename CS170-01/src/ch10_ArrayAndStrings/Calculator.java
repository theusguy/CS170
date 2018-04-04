package ch10_ArrayAndStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Calculator {
	//Instance Variables
	private String expression;
	private String[] expressions;
	int index;
	double result;
	
	//method to prompt user to enter expression using JOptionPane
	public void requestInput() {
		expression = JOptionPane.showInputDialog("Please enter the expression below: ");
	}
	
	//method to break operands and operations into array slots.
	public void parseExpression() {
		expressions = expression.split(" ");
	}
	
	//replace two operands and operation with ans then return a string.
	public void compute(String operator, String operator2) {
		boolean operation = false;
		
		do {
			//tester to see if there are any first rate operators in expression
			for(int i = expressions.length - 1; i > 0; i--) {
				if (expressions[i].equalsIgnoreCase(operator) || expressions[i].equalsIgnoreCase(operator2)) {
					operation = true;
					index = i;
					//solving those first rate operations
					double firstOperand = Double.parseDouble(expressions[index-1]);
					double secondOperand = Double.parseDouble(expressions[index+1]);
					result = Calculator.operation(expressions[index], firstOperand, secondOperand);
				}
			}
			System.out.println(index);
			System.out.println(Arrays.toString(expressions));
			
			
			//Recreating expressions array
			String[] newArray = new String[expressions.length - 2];
			for (int i = 0; i < index - 1; i++) {
				newArray[i] = expressions[i];
			}
			newArray[index-1] = Double.toString(result);
			for (int i = index; i < newArray.length; i++) {
				newArray[i] = expressions[i + 2];
			}
			expressions = newArray.clone();
			
			expression = newArray.toString();
			
//			if (expression.contains(operator) || expression.contains(operator2)) {
//				operation = true;
//			} else {
//				operation = false;
//			}
		} while (operation);
	}
	
	// 5 + -10.02 - 2 * 8.5 / 3.4 - -6 + 100.89
	//method to go through switch statement for correct math operation
	private static double operation(String operation, double first, double second) {
		switch (operation) {
		case "*" : return (first * second);
		case "/" : return (first / second);
		case "+" : return (first + second);
		case "-" : return (first - second);
		default: return 0;  //NOT GOOD 
		}
	}
	//toString method
}
