package ch14_Multithreading;

import java.util.Scanner;

public class ThreadInterruptApp {
	public static void main(String[] args) {
		//Just printing for main thread to test out
		System.out.println("current thread: " + Thread.currentThread().getName());
		System.out.println("Is thread Interrupted?" + Thread.currentThread().isInterrupted());
		
		//Creating a Thred Object
		Thread service = new Service();
		//Starting the thread
		service.start();
		//Scanner to keep scanning for when user finally enters stop
		Scanner sc = new Scanner(System.in);
		String choice = "";
		while (!choice.equals("stop")) {
			choice = sc.next();
		}
		//Once it breaks the loop meaning user entered "stop" it will interrupt the thread.
		service.interrupt();
		
	}
}

class Service extends Thread {
	private int count = 1;
	//while it is not interrupted it will continue for service
	public void run() {
		while (!isInterrupted()) {
			System.out.println(this.getName() + " providing service " + count++);
			System.out.println("Type stop to interrupt");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("This thread service was interrupted by user");
	}
}