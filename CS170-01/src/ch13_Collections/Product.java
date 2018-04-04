package ch13_Collections;

public class Product {
	//Instance variables protected meaning only accessible to classes within package
	protected String name;
	protected int quantity;
	protected double price;
	
	//Constructor to set up an object with all instance variables set
	public Product(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	//Since all objects will have their instance vars set by nature 
	//there are only getters coded
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String message = "Name: " + name + " Quantity: " + quantity + " Price: " + price;
		return message;
	}

}

class Book extends Product {
	String ISBN;
	
	public Book(String name, int quantity, double price, String ISBN) {
		super(name, quantity, price);
		this.ISBN = ISBN;
	}
	
	public String toString() {
		return super.toString() + "ISBN: " + ISBN;
	}
}
