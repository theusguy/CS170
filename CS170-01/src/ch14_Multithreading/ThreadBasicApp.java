package ch14_Multithreading;

public class ThreadBasicApp {
	public static void main(String[] args) {
		//Constructing thread objects without saving them and start method to send them to CPU to begin execution
		new MessageOne().start();
		new MessageTwo().start();
	}
}
class MessageOne extends Thread {
	public void run() {
		System.out.print("Java ");
		System.out.print("SE ");
	}
}
class MessageTwo extends Thread {
	public void run() {
		System.out.print("Programming ");
		System.out.print("Art ");
	}
}