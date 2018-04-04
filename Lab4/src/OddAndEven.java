/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Class that runs two threads parallel to print 1 - 50 by yielding
*********************************************************************************/
/**
 * #5 Chapter 14
 * 
 * @author User
 *
 */

public class OddAndEven {
	public static void main(String[] args) {
		Thread even = new Even();
		Thread odd = new Odd();
		
		even.start();
		odd.start();
	}

}
class Odd extends Thread {
	public void run() {
		for(int i = 1; i <= 49; i+= 2)  {
			System.out.println(this.getName() + " : " + i);
			Thread.yield();
		}
	}
}
class Even extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i += 2) {
			System.out.println(this.getName() + " : " + i);
			Thread.yield();
		}
	}
}
