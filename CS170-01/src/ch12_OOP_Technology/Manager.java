package ch12_OOP_Technology;
/**
 * Class <strong>Manager</strong> inherits <strong>Employee</strong>.
 * <strong>Manager</strong> is sued to instantiate objects, return salary and the name 
 * of the object.
 * 
 * @author Usman
 * @version 1.1.0
 *
 */
public class Manager {
	/**
	 * Instance variable and its value must be greater or equal to 0.
	 */
	protected double salary;
	/**
	 * Constructor to instantiate objects
	 * 
	 * @param name A <strong>String</strong> - object name.
	 * @param salary A <strong>double</strong> - salary.
	 */
	public Manager(String name, double salary) {
		this.salary = salary;
	}
}
