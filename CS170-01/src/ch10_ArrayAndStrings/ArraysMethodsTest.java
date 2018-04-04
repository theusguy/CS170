package ch10_ArrayAndStrings;

import java.util.Arrays;

public class ArraysMethodsTest {
	public static void main(String[] args) {
		
		//Use method .equals()
		String[] names1 = { "C", "C++", "Java" };
		String[] names2 = { "c", "C++", "Java" };
		if (Arrays.equals(names1, names2)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		//Arrays.equals doesnt provide a case insensitive version of comparing
		
		//Call method .equals()
		Object[] objects1 = { new Double(10.20), new Integer(20) };
		Object[] objects2 = { new Double(10.20), new Integer(20) };
		if (Arrays.equals(objects1, objects2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		
		//-------------------------------------------------------
		
		//Sorting and Searching
		//Must implement Comparable interface to User created object arrays
		
		int[] scores = {2, 4, 0, 1, 10, 9, 5, 3, 8};
		Arrays.sort(scores);
		for (int score : scores) {
			System.out.print(score + "\t");
		}
		
		System.out.println();
		
		
		//Call method sort() and binarySearch()
		String[] javas = {"Java SE", "JSP", "Java EE", "Java ME", "Servlets", "Applets", "Java"};
		Arrays.sort(javas);
		int index = Arrays.binarySearch(javas, "Java");
		for (String java : javas) {
			System.out.print(java + "  ");
		}
		
		System.out.println("\n" + "index of \"Java\": " + index);
		
		//Calling sort and binarySearch on 2-D Arrays
		Double[][] doubles = { {new Double(2.98), new Double(19.23), new Double(0.09)},
							   {new Double(1.02), new Double(20.34), new Double(2.09), new Double(8.201), new Double(0.01)} };
		Arrays.sort(doubles[0]); //Sorting the array in doubles[0]
		Arrays.sort(doubles[1]); //Sorting the array in doubles[1]
		
		for (Double[] row : doubles) {
			for (Double col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println("index of 2.09 " + Arrays.binarySearch(doubles[1], 2.09));
		System.out.println("index of 2.98001 " + Arrays.binarySearch(doubles[0], 2.98001));
		
		//-----------------------------------------------------------------
		//Copying Arrays
		
		//Call copyOf() method
		double[] grades = { 98, 78, 89, 82, 100, 67 };
		double[] copyGrades = Arrays.copyOf(grades, grades.length);
		
		for(double copy : copyGrades) {
			System.out.print(copy + "  ");
		}
		System.out.println();
		
		//Call method copyOfRange()
		double[] copySomes = Arrays.copyOfRange(grades, 3, grades.length);
		for (double copySome : copySomes) {
			System.out.print(copySome + "  ");
		}
		System.out.println("\n");
		
		//Call method arraycopy()
		copyGrades = new double[grades.length];
		System.arraycopy(grades, 0, copyGrades, 0, grades.length);
		for (double copy : copyGrades) {
			System.out.print(copy + "  ");
		}
		System.out.println();
		
		//All above methods for copying arrays will 
		//perform shallow copying if array is user defined class type
		//meaning both target and destination array will point to the same object address
		
		
		
		
		
		
		
		
	} //end main

}
