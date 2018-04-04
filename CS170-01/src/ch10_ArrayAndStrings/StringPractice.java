package ch10_ArrayAndStrings;

public class StringPractice {
	public static void main(String[] args) {
		//Default String instantiation
		String s1 = new String("Defualt type");
		
		//Instantiating String by passing an array as arg
		byte[] country = {67, 104, 105, 110, 97};
		String array = new String(country);
		//More specifc String constructor with array arg
		String countryCode = new String(country, 0, 2);
		
		
	}

}
