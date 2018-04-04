package ch12_OOP_Technology;

public class Bucky {
	public static void main(String[] args) {
		
		System.out.println(max(23,45,1));
	}
	
	public static <T extends Comparable<T>> T  max(T a, T b, T c) {
		T m = a;
		
		if (b.compareTo(a) > 0) {
			m = b;
		}
		if (c.compareTo(m) > 0) {
			m = c;
		}
		
		return m;
	}
}
