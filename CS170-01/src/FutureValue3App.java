//import java.util.*;
//
//public class FutureValue3App {
//	public static void main(String[] args) {
//		String choice = "y",
//				userName;
//		double monthlyInvestment,
//				yearlyReturnRate;
//		int investYears;
//		final int minYear = 1,
//					maxYears = 150;
//		
//		Scanner sc = new Scanner(System.in);
//		FutureValue3 fuureValue = new FutureValue3();
//		
//		while (choice.equals("y")) {
//			System.out.println("Please enter your name: ");
//			userName = sc.next();
//			
//			futureValue.setName(userName);
//			
//			monthlyInvestment = Validator3.validateDouble(sc, "Please enter monthly investment: ");
//			futureValue.setMonthlyInvest(monthlyInvestment);
//			
//			yearlyReturnRate = Validator3.validateDouble(sc, "Please enter the annual interest rate: ");
//			futureValue.setYearlyRate(yearlyReturnRate);
//			
//			investYears = Validator3.validateInt(sc, "Please enter the invest years: ", minYear, maxYears);
//			futureValue.setYears(investYears);
//			
//			futureValue.futureValueCompute();	//Call the method to compete
//			
//			System.out.println("Your return value: $" + futureValue.getFutureValue());
//			System.out.println("Continue?(y/n)");
//			
//			choice = sc.next();		//Get the choice
//			sc.nextLine();			//Clear the buffer
//		} //end while
//		
//		System.out.println("Good bye!");
//	} //end main method
//} //end class
