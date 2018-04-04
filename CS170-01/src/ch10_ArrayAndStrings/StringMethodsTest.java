package ch10_ArrayAndStrings;

public class StringMethodsTest {
	public static void main(String[] args) {
		//Finding String length from .length() method
		String title = "Java Programming in Practice!";
		int titleLength = title.length();
		System.out.println("titleLength: " + titleLength);
		
		//Using indexOf(char) method
		int index = title.indexOf('a');
		System.out.println("index of a = " + index);
		
		//Using indexOf(String) method
		int index1 = title.indexOf("in");
		System.out.println("index1 of in = " + index1);
		
		//Using indexOf(String, int) to search for first occurrence of String after index int
		int index2 = title.indexOf("in", 14);
		System.out.println("Index2 of in = " + index2);
		
		//Using lastIndexOf(char) to find the last occurrence of char
		int index3 = title.lastIndexOf('a');
		System.out.println("Index3 of a = " + index3);
		
		//Using lastIndexOf(String, index) to find last occurrence of String after index
		int index4 = title.lastIndexOf("Pr", 19);
		System.out.println("Index4 of a = " + index4);
		
		String str = "Java Programming";
		
		//Using the charAt method
		char ch = str.charAt(0);
		System.out.println("ch = " + ch);
		
		//Using split(String") ..basically removes all String from the OG String and stores the bits in an array
		String[] result = str.split("a");
		System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
		
		//Substring prac
		String greeting = new String("Welcome to Java Programming Community");
		String substring = greeting.substring(0);
		System.out.println("substring = " + substring);
		
		//Substring prac 2
		String substring1 = greeting.substring(11,  15);
		System.out.println("substring1 = " + substring1);
		
		//replace method -- replace(String, String) first string is replaced by second string arg
		String replaceString = greeting.replace("Java", "JSP");
		System.out.println("replace String = " + replaceString);
		
		//Should break array based on " " then print each part in its own line
		String[] splits = greeting.split(" ");
		for (String split : splits) {
			System.out.println(split);
		}
		
		//Turn String into a char array
		String greeting2 = new String("Java");
		char[] charArray = greeting2.toCharArray();
		for(char ch1 : charArray) {
			System.out.print(ch1 + " ");
		}
		System.out.println();
		
		//....skipped the .equals methods.. TOO TIRED.. i already know about it..
	} //end main

}
