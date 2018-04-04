package ch14_Multithreading;

public class Message {
	public void display(String letters) {
		System.out.println(letters);
	}
}
class MessageJava extends Message implements Runnable {
	public void run() {
		display("Java ");
		display("SE ");
		
	}
}
class MessageProgramming extends Message implements Runnable {
	public void run() {
		display("Programming ");
		display("Art \n");
	}
}
