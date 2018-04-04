package ch14_Multithreading;

public class SimpleThreadTest {
	public static void main(String[] args) {
		//Printing the name of current thread running: which is default main thread
		System.out.println(Thread.currentThread().getName());
		
		//Creating two threads
		Thread thread1 = new HelloThread();
		Thread thread2 = new HelloThread();
		
		thread1.start();
		thread2.start();
	}

}

class HelloThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello World! " + this.getName() + " is running..." + i);
		}
	}
}
