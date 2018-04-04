package ch14_Multithreading;

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
