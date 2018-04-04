package ch14_Multithreading;

public class Shop {
	//tracking the business
	private static int numOfProduct = 0;
	
	public static void producing() {
		numOfProduct++;
		System.out.println("Number of products available: " + numOfProduct);
	}
	
	//display consuming process
	public static void consuming() {
		numOfProduct--;
		System.out.println("Number of products available: " + numOfProduct);
	}
}
