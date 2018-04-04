package ch13_Collections;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		//Creating a collection of ArrayList with default size 10 and not type safe check
		ArrayList noSafeList = new ArrayList();
		//Create a  String collection ArrayList with default size 10
		ArrayList<String> nameList = new ArrayList<String>();
		//Create a Double collection ArrayList with a size of 80
		ArrayList<Double> priceList = new ArrayList<Double>(80);
		//Create a Product2 objects collection ArrayList with default size 10
		//ArrayList<Product2> productList = new ArrayList<Product2>();
		//Create a String collection inheriting the elements of another collection called nameList
		ArrayList<String> list = new ArrayList<String>(nameList);
		
		//list ArrayList is empty becuase at the time this runs..nameList is empty
		
		//Proving noSafeList can take in any object types (Primary types are autoboxed)
		noSafeList.add(10);
		noSafeList.add("Java");
		nameList.add("Lee");
		nameList.add("Smith");
		
		//System.out.println(noSafeList.get(0));
		
		//added Double object to ArrayList (adds to the end of ArrayList: in this case the first element)
		priceList.add(129.65);
		//Adds 89.76 to the indicated index and moves everything in that indea and after one up
		priceList.add(0, 89.76);
		
		//System.out.println(priceList.contains(129.65));
		System.out.println(list);
		
		//Created anew list2 String Collection inheriting the elements of nameList
		ArrayList<String> list2 = new ArrayList<String>(nameList);
		System.out.println(list2.isEmpty());
		
		//Using some methods of ArrayList
		list2.remove(1);
		list2.add(0, "Lisa");
		System.out.println("Size of list2 = " + list2.size());
		System.out.println("Size of nameList = " + nameList.size());
		
		//Both ArrayLists are not connected meaning they are just referneces but speretae objects
		System.out.println(list2);
		System.out.println(nameList);
		
		//Calling method to return array and save it
		Object[] doubleArray = priceList.toArray();
		//printing first element of doubleArray
		System.out.println(doubleArray[0]);
		//toString to print ArrayList
		System.out.println(priceList);
		
		//Shifting to LinkedList
		LinkedList<String> linkedList = new LinkedList<String>(nameList);
		//System.out.println(linkedList);
		
		linkedList.addFirst("Jon");
		linkedList.addLast("Duke");
		System.out.println("LinkedList = " + linkedList);
		
		Object obj = linkedList.getFirst();		//obj = "Jon"
		System.out.println("Last index of \"Lee\" = " + linkedList.lastIndexOf("Lee"));
		
		Iterator<String> iterator = linkedList.iterator();
		
		int i = 1;
		while (iterator.hasNext()) {
			System.out.println(i + "th element: " + iterator.next());
			i++;
		}
	}

}
