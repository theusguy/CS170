/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (11/01)
Brief Description: Validator class used to validate user inputs with different methods
*********************************************************************************/

public class Validator {
	
	public Validator(){
		
	}
	
	public boolean isName(String n){
		
		if(n.matches(("[A-Za-z]+"))){
			
			return true;
		}
		
		return false;
	}

	public boolean isNumber(String n){
		
          if(n.matches(("[1-9]+"))){
			
			return true;
		}
		
		return false;
		
	}
	
	public boolean isMarks(int n){
		
		if (n == (int)n){
			
			return true;
		}
		
		return false;
		
	}
	public boolean isChar(String str) {
	    if (str.length() != 1) return false;
	    char c = Character.toLowerCase(str.charAt(0));
	    return c >= 'a' && c <= 'z';
	}
}
