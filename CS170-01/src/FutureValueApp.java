import javax.swing.JOptionPane;

public class FutureValueApp {
	public static void main(String[] args) {
		
		String choice = "y", str, userName;
		
		FutureValue futureValue = new FutureValue();
		
		while (choice.equalsIgnoreCase("y")) {
			userName = JOptionPane.showInputDialog("Welcome to future value application!\n\n" + "Please enter your name: ");
			futureValue.setName(userName);
			
			//monthly investment
			str = JOptionPane.showInputDialog("Enter your monthly invest: ");
			futureValue.setMonthlyInvest(Double.parseDouble(str));
			
			//yearly investment rate
			str = JOptionPane.showInputDialog("Enter yearly return rate: ");
			futureValue.setYearlyRate(Double.parseDouble(str));
			
			//amount of years
			str = JOptionPane.showInputDialog("Enter the number of years: ");
			futureValue.setYears(Integer.parseInt(str));
			
			futureValue.futureValueCompute();
			
			JOptionPane.showMessageDialog(null, "Your future return is: " + futureValue.getFutureValue());
			
			choice = JOptionPane.showInputDialog("continue? (y/n): "); 
		} //end while
		
		JOptionPane.showMessageDialog(null, "Thank you for using Future Value Application");
	} //end main
}
