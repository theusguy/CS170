package part3;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Operation class used to create BusinessAccount instances
*********************************************************************************/
public class BusinessAccountApp {
	public static void main(String[] args) {
		BusinessAccount first = new BusinessAccount(5000, 2000);
		System.out.println(first);
		BusinessAccount second = new BusinessAccount(7000, 4000);
		System.out.println(second);
	}

}
