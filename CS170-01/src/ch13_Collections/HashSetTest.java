package ch13_Collections;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		//Create a collection with no type safety with default size 16
		HashSet mySet = new HashSet();
		//Create a Character type Collection with default size 16
		HashSet<Character> set = new HashSet<Character>();
		//Create a collection String type size 9
		HashSet<String> hisSet = new HashSet<String>(9);
		//Create a Double type Collection with size deafult 16
		Collection<Double> yourSet = new HashSet<Double>();
		//Create a collection with elements of mySet and wildcard type safety
		Collection<?> herSet = new HashSet(mySet);
		
		hisSet.add("Wang");
		hisSet.add("45");
		
		herSet = new HashSet<String>(hisSet);
		System.out.println("herSet = " + herSet);
		
		Iterator<String> hisSetIt = hisSet.iterator();
		while (hisSetIt.hasNext()) {
			System.out.println(hisSetIt.next());
		}
	}

}
