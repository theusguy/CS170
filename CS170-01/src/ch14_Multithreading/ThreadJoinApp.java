package ch14_Multithreading;

public class ThreadJoinApp {
	public static void main(String[] args) {
		//Created a new Thread Object
		Thread demo = new Estimate();
		
		//Started the object
		demo.start();
		
		//Caution: join() and sleep() are throw checked exceptions so
		//You must put them in a try catch to catch InterruptedException
		try {
			demo.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("PI = " + Estimate.PI);
	}

}

class Estimate extends Thread {
	public static double PI = 0.0;
	private int sign = 1;
	public void run() {
		for (long i = 1; i <= 9999999; i += 2) {
			PI += 4.0 * ((double)sign/i);
			sign = -sign;
		}
	}
}
