package ch13_Collections;

public class EmployeeWildcard<T> {
	private T name;
	
	public EmployeeWildcard(T name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		EmployeeWildcard<String> employeeList = new EmployeeWildcard<String>("John Smith");
	}

}
