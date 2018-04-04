package ch10_ArrayAndStrings;

import java.util.Arrays;

public class ArraysClassPractice {
	public static void main(String[] args) {
		int[] educationYears = new int[8];
		
		//basic usage of .fill()
		Arrays.fill(educationYears, 10);
		
		//"fill" first four elements with value 15
		Arrays.fill(educationYears, 0, 4, 15);
		
		for (int element : educationYears) {
			System.out.println(element);
		}
	}
}
