package part3;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Business Account class responsible for implementing interfaces
*********************************************************************************/
public class BusinessAccount implements Accountable, AccountReceivable{
	private double deposit, withdraw;
	
	public BusinessAccount(double deposit, double withdraw) {
		this.deposit = deposit;
	}
	public void withdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	public double getPayment() {
		return (deposit - withdraw);
	}
	
	public void deposit(double deposit) {
		this.deposit = deposit;
	}
	
	public String toString() {
		return "The amount in business class " + getPayment();
	}
}
