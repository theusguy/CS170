package ch10_ArrayAndStrings;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//Construct StringTokenizer object consisting of tokens:
		//"Java", "JSP", "Servlets" and "JavaBeans"
		//using whitespace as delimiting characters
		
		//Creating a StringTokenizer witha String and using default whitespace as delimiter
		StringTokenizer token = new StringTokenizer("Java JSP Servlets JavaBeans");
		System.out.println(token.countTokens());
		
		//Passing a string and custom delimiter
		StringTokenizer dateToken = new StringTokenizer("10-15-2007", "-");
		System.out.println(dateToken.countTokens());
		
		//You can also choose to count delimiters as tokens or not
		StringTokenizer dateToken2 = new StringTokenizer("10-15-2007", "-", true);
		//true: You want to count delimiter "-" as tokens as well
		//false: meaning count tokens as default
		
		while(dateToken2.hasMoreTokens()) {
			System.out.println(dateToken2.nextToken());
			System.out.println("Number of tokens left: " + dateToken2.countTokens());
		}
	}

}
