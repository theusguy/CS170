package ch14_Multithreading;

public class EvenAndOddRunnable {
	public static void main(String[] args) {
		Thread even = new Thread(new EvenRun());
		Thread odd = new Thread(new OddRun());
		
		even.start();
		odd.start();
	}

}
class EvenRun implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 0; i <= 50; i+= 2)  {
			System.out.println(t.getName() + " : " + i);
			Thread.yield();
		}
	}
}

class OddRun implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 49; i+= 2)  {
			System.out.println(t.getName() + " : " + i);
			Thread.yield();
		}
	}
}
