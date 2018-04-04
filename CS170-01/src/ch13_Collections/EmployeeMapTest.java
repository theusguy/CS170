package ch13_Collections;

import java.util.*;

public class EmployeeMapTest {
	public static void main(String[] args) {
		Map<String, String> employeeMap = new HashMap<String, String>();
		//Adding employees to the Map
		employeeMap.put("1110", "Ming Zhu");
		employeeMap.put("1115", "John Smith");
		employeeMap.put("1112", "Lee Wong");
		
		System.out.println("Size of meployyeMap: " + employeeMap.size());
		System.out.println(employeeMap);
	}
	
}
