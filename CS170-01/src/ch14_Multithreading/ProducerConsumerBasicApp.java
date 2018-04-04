package ch14_Multithreading;

public class ProducerConsumerBasicApp {
	public static void main(String[] args) {
		//Created a Thread Object Array holding four Producer threads
		Thread[] producer = new Producer[4];
		
		//Created a Thread Object Array holding four Consumer Threads
		Thread[] consumer = new Consumer[4];
		
		for (int i = 0; i < 4; i++) {
			//Now for every element in array:
			//We are instantiating a Thread Object and starting it
			producer[i] = new Producer();
			producer[i].setPriority(10);
			producer[i].start();
			
			//We are instantiating a Thread Object and starting it
			consumer[i] = new Consumer();
			consumer[i].start();
			
			//Printing out results of current Producer and Consumer Thread created
			System.out.println("Consumer Thread Name: " + consumer[i].getName() + "is created..");
		}
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}

}
