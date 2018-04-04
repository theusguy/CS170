package ch14_Multithreading;

public class Consumer extends Thread{
	public void run() {
		System.out.println(this.getName() + " is consuming..");
		Shop.consuming();
	}
}
