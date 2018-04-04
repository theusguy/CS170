package part2.src;
/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: SeniorWorker business class extending Employee with additional 
overtimePay and meritPay.
*********************************************************************************/
public class SeniorWorker extends Employee{
	protected double salary;
	protected double overtimePay;
	protected double meritPay = salary*0.1;
	
	public SeniorWorker(String name, double salary, double overtimePay) {
		super(name);
		this.salary = salary;
		this.overtimePay = overtimePay;
	}
	
	public double earnings() {
		meritPay = salary * 0.1;
		return salary + overtimePay + meritPay;
	}
	
	public String toString() {
		return "SeniorWorker: " + this.name;
	}

}
