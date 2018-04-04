package ch10_ArrayAndStrings;

public class Item {
	//Instance variables
	private int number;
	private String name;
	
	Item (int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//Since compareTo is a general method, Its parameter was set to Object class type
	public int compareTo(Object object) {
		Item item = (Item) object;  //But once you've received the object, you should cast it back to the class type you're dealing with
		if (this.number < item.getNumber()) {
			return -1;     //One of the return value of compareTo..what it means is self explanatory
		}
		if (this.number > item.getNumber()) {
			return 1;     //You already know..read above comment
		}
		return 0;        //If you don't know by now..YOU STUPID, Usman!
	}

}
