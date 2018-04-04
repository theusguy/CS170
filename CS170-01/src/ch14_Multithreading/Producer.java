package ch14_Multithreading;

//Making Producer Thread
public class Producer extends Thread{
	public void run() {
		System.out.println(this.getName());
		System.out.println(" is producing...");
		Shop.producing();
	}

}
