package ch13_Collections;

import java.util.*;

public class WildcardTest {
	public static void main(String[] args) {
		//bList can be a List of any type, not defined yet
		List<?> bList;
		
		//iList is a list with Integer type
		List<Integer> iList = new ArrayList<Integer>();
		//Just adding some elements to List
		iList.add(8);
		iList.add(88);
		
		//Now making bList = to iList
		bList = new ArrayList<Integer>(iList);
		
		List<Double> dList = new ArrayList<Double>();
		dList.add(0.8);
		dList.add(0.08);
		bList = new ArrayList<Double>(dList);
	}
}
