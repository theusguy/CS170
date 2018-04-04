package ch13_Collections;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//Size 10 HashMap map with no type safety
		HashMap myMap = new HashMap(10);
		//Default size 16 String type
		HashMap<String, String> phonebook = new HashMap<String, String>();
		
		//Replaces value of the key specified with new value and returns old value
		phonebook.put("Lee", "510-666-9900");
		System.out.println(phonebook.put("Smith", "408-322-2277"));
		//old value can be null if the key is not found in HashMap
		
		String oldValue = phonebook.put("Lee", "925-333-5566");
		System.out.println("old value = " + oldValue);
		
		System.out.println(phonebook);
		
		//true
		System.out.println(phonebook.containsKey("Smith"));
		//false
		System.out.println(phonebook.containsValue("510666-9900"));
		
		//Gets value from indicated key
		String phone = phonebook.get("Lee");
		System.out.println(phone);
		
		//Saving all keys in a Set Collection using special method
		Set<String> phoneSet;
		phoneSet = phonebook.keySet();
		
		//Going thorugh an Iterator to loop through all the elements
		for (Iterator iterator = phoneSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		System.out.println(phoneSet);
		
		Collection<String> phoneValues = phonebook.values();
		
		for(Object value : phoneValues) {
			System.out.println(value);
		}
		
		//Switching to treemap
		
		//No type safety
		TreeMap treeMap = new TreeMap();
		
		//TreeMap with String String type safety with default 
		TreeMap<String, String> emailMap = new TreeMap<String, String>();
		//replace the value of the key with new value..returns null if not found
		emailMap.put("zhao123@gmail.com", "Zhao Xiao");
		emailMap.put("qian_li@hotmail.com", "Li Qian");
		//special method for obtaining first key in TreeMap
		String firstKey = emailMap.firstKey();
		//Reuturns the greatest key that is equal to or less than the specified key.
		String lowerKey = emailMap.lowerKey("zhao123@gmail.com");
		System.out.println("lower key = " + lowerKey);
		System.out.println(firstKey);
		System.out.println(emailMap);
		
		
		
		
		
		
		
		
		
		
	}

}
