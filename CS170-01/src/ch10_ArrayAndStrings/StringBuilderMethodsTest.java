package ch10_ArrayAndStrings;

public class StringBuilderMethodsTest {
	public static void main(String[] args) {
		StringBuilder phone = new StringBuilder("510-651-5168");
		//Finding length of StringBuilder
		int length = phone.length(); //Length is 12 bytes
		System.out.println("length = " + length);
		
		//Everything StringBuilder is the OG string + 16 bytes
		int capacity = phone.capacity(); //So capacity is 28bytes
		System.out.println("capacity = " + capacity);
		
		//Changing StringBuilder length to 3
		phone.setLength(3);  
		System.out.println("phone = " + phone); // phone = 510
		System.out.println("capacity = " + phone.capacity()); //still 28
		//Capacity does not change when length is modified. However it may increase 
		//if the length is increased from the OG length.
		
		//Changing StringBuilder length back to 12
		phone.setLength(12); //But remove data cannot be recovered
		System.out.println("phone = " + phone); //length is now 12
		System.out.println("capacity = " + capacity); //capacity = 28
		
		//making another StringBuilder
		StringBuilder phone2 = new StringBuilder("510-651-5168");
		phone2.append(" ext. 299");
		System.out.println("phone2 = " + phone2); //phone2 = "510-651-5168 ext. 299"
		
		phone2.delete(4, 7); //deletes subtring of StringBuilder (inclusive, exclusive)
		System.out.println("phone2 = " + phone2); // phone2 = "510--5168 ext. 299"
		
		phone2.insert(4, "659"); //Inserts the string starting at index 4 in String array
		System.out.println("phone2 = " + phone2);
		
		phone2.replace(0, 3, "408"); //Replaces (inclusive, exclusive) with str
		System.out.println("phone2 = " + phone2);
		
		
		
		
	}

}
