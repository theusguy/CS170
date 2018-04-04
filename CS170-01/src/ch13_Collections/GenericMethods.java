package ch13_Collections;

public class GenericMethods {
	public static void main(String[] args) {
		Integer[] iray = {1,2,3,4,5};
		Character[] cray = {'b','u','c','k','y'};
		
		printMe(iray);
		printMe(cray);
	}
	
	//generic method
	//must have type-parameter before return type.
	public static <T> void printMe(T[] x) {
		for(T element : x) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}
