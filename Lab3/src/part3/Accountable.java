package part3;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Interface for withdrawing from business account
*********************************************************************************/
public interface Accountable {
	public abstract void withdraw(double var);
	
	public abstract double getPayment();
}
