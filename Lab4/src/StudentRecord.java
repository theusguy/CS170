/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Class used to store students record, for sorting using Comparable interface
*********************************************************************************/

public class StudentRecord implements Comparable<StudentRecord>{

	private String name;
	private int marks;
	private String grade;
	
	public StudentRecord(String t, int c, String g){
		
		this.name = t;
		this.marks = c;
		this.grade = g;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}


	
	@Override
	public String toString(){
		
		return "Course Title : " + this.getName() +" Credit Hr: " + this.getMarks() +" Grade : " + this.getGrade();
	}

	@Override
	public int compareTo(StudentRecord o) {
		
		return this.marks - o.marks;
}
}
