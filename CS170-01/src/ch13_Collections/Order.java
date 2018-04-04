package ch13_Collections;

import java.util.*;
import java.text.NumberFormat;

public class Order {
	//Instance var consists of ArrayList storing allProducts chosen to checkout
	//and NormatFormat object to write appropriate total number in USD (or any currency)
	private ArrayList<Product> orderList;
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	//By creating an object you make a new ArrayList ready to add all products you order
	public Order() {
		orderList = new ArrayList<Product>();
	}
	
	//Method to add an order
	public void addOrder(Product product) {
		orderList.add(product);
	}
	
	//get order cart info on an item
	public String getOrderInfo(String name) {
		Iterator<Product> iterator = orderList.iterator();
		int totalQuantity = 0;
		double totalAmount = 0.0;
		String message;
		Product order;
		while (iterator.hasNext()) {
			order = iterator.next();
			
			if (name.equals(order.getName())) {
				totalQuantity += order.getQuantity();
			}
			totalAmount = order.getPrice();
		}
		totalAmount *= totalQuantity;
		message = "Product name: " + name + "\nTotal Quantity: " + totalQuantity + "\nTotal Amount: " + currency.format(totalAmount);
		return message;
	}
	
	public String getInvoiceTotal() {
		double total = 0.0;
		
		for (Product order : orderList) {
			total += order.getPrice() * order.getQuantity();
		}
		
		return "Grand Total: " + currency.format(total);
	}

}
