/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Main class used to print output on the screen with doing logic of the program
*********************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * Main class used to print output on the screen with doing logic of the program
 * 
 */


public class MainClass {
public static void main(String[] args) {
	
	char option = '\0';
	List<StudentRecord> students = new ArrayList<>();
	Validator validate = new Validator();
	Scanner input = new Scanner(System.in);
	 do { // statr do-while
		 String title ="";
		 String credit = "";
		 String grade = "";
		 System.out.print("Enter course title : ");
		 title = input.nextLine();
		 while(!validate.isName(title)){
			 
			 System.out.print("Enter course title : ");
			 title = input.nextLine();
		 }
		 System.out.print("Enter credit hour : ");
		 credit = input.nextLine();
         while(!validate.isNumber(credit)){
			 
			 System.out.print("Enter credit hour : ");
			 credit = input.nextLine();
		 }
		 System.out.print("Enter grade : ");
		 grade = input.nextLine();
        while(!validate.isChar(grade)){
			 
        	 System.out.print("Enter grade : ");
    		 grade = input.nextLine();
		 }
		 //students.add(new StudentRecord(title,credit,grade));
		 System.out.print("would you want to continue ? (Y/N):");
         Scanner s1 = new Scanner(System.in);
         option= s1.next().charAt(0); //get character from user
         System.out.println(" ");

     } while (option == 'Y' || option == 'y'); //continue if user enter 'y'
	 
	 
	 do { // statr do-while
		 System.out.println("1. Adding Student Record");
		 System.out.println("2. Deleting Student Record");
		 System.out.println("3. Sorting Student Record");
		 System.out.println("4. Searching Student Record");
		 System.out.println("5. Printing Student Record");
		 
		 int menu = input.nextInt();
		 switch(menu){
		 
		 case 1:
			 
			 String name = "";
			 int marks = 0;
			 String grade = "";
			 
			 System.out.print("Enter name :");
			 input.nextLine();
			 name = input.nextLine();
			 while(!validate.isName(name)){
				 
				 System.out.print("Enter name :");
				 name = input.nextLine();
			 }
			 
			 System.out.print("Enter marks :");
			 marks = input.nextInt();
			 while(!validate.isMarks(marks)){
				 
				 System.out.print("Enter marks : ");
				 input.nextLine();
				 marks = input.nextInt();
			 }
			 
			 System.out.print("Enter grade :");
			 input.nextLine();
			 grade = input.nextLine();
			 while(!validate.isChar(grade)){
				 
				 System.out.print("Enter grade : ");
				 grade = input.nextLine();
			 }
			 
			 students.add(new StudentRecord(name,marks,grade));
			 
			 break;
		 case 2:
			 
			 System.out.print("Enter student name for delete : ");
			 input.nextLine();
			 String n = input.nextLine();
			 boolean found = false;
			 for(int i=0; i< students.size() ;i++){
				 
				 if(students.get(i).getName().equals(n)){
					 
					 students.remove(i);
					 found = true;
				 }
			 }
			 if(found){
				 System.out.println("Student is removed");
			 }
			 else{
				 System.out.println("Student not found!!!");
			 }
			 
			 break;
		 case 3:
			 System.out.println("Before Sorting");
             for(StudentRecord s : students){
				 
				 System.out.println(s.toString());
			 }
			 
			 Collections.sort(students);
			 System.out.println("After Sorting");
             for(StudentRecord s : students){
				 
				 System.out.println(s.toString());
			 }
			 break;
			 
		 case 4:
			 System.out.print("Enter student name for searching : ");
			 input.nextLine();
			 String s = input.nextLine();
			 boolean isFound = false;
			 int index =0;
			 for(int i=0; i< students.size() ;i++){
				 
				 if(students.get(i).getName().equals(s)){
					 
					
					 isFound = true;
					 index = i;
				 }
			 }
			 if(isFound){
				 System.out.println(students.get(index).toString());
			 }
			 else{
				 System.out.println("Student not found!!!");
			 }
			 break;
		 case 5:
			
			 for(StudentRecord student : students){
				 
				 System.out.println(student.toString());
			 }
			 
			 break;
			 default:
				 System.out.println("Invalid option!!!");
		       break;
		 }
		 System.out.print("would you want to continu? (Y/N):");
         Scanner s1 = new Scanner(System.in);
         option= s1.next().charAt(0); //get character from user
         System.out.println(" ");

     } while (option == 'Y' || option == 'y'); //continue if user enter 'y'
	 
	 
	 
}
}
