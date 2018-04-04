package ch14_Multithreading;

public class SimpleThreadYieldTest {
	public static void main(String[] args) {
		//Prints out main since its by default the first thread to run
		System.out.println(Thread.currentThread().getName());
		
		//Creating two threads 
		Thread thread1 = new HelloThread2();
		Thread thread2 = new HelloThread2();
		
		//Starting both threads to run
		thread1.start();
		thread2.start();
	}

}

//file class
class HelloThread2 extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello World! " + this.getName() + " is running...");
			
			Thread.yield();
		}
	}
}
