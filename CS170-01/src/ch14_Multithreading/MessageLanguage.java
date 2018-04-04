package ch14_Multithreading;

public class MessageLanguage {
	public static void main(String[] args) {
		Thread first = new MessagePartOne();
		Thread second = new MessagePartTwo();
		
		second.start();
		first.start();
	}
}

class MessagePartOne extends Thread {
	public void run() {
		System.out.print("Java ");
		System.out.print("SE ");
	}
}
class MessagePartTwo extends Thread {
	public void run() {
		try {
			//Make current thread sleep for 500milliseconds
			Thread.sleep(500);
			System.out.print("Programming ");
			System.out.print("Art ");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
