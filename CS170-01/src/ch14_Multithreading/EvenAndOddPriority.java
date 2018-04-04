package ch14_Multithreading;

public class EvenAndOddPriority {
	public static void main(String[] args) {
		Thread even = new EvenNum();
		Thread odd = new OddNum();
		
		even.setPriority(1);
		odd.setPriority(10);
		
		even.start();
		odd.start();
	}

}
class OddNum extends Thread {
	public void run() {
		for(int i = 1; i <= 49; i+= 2)  {
			System.out.println(this.getName() + " : " + i);			
		}
	}
}
class EvenNum extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i += 2) {
			System.out.println(this.getName() + " : " + i);
		}
	}
}
