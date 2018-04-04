import java.util.Scanner;

public class FindMajor {
	public static void main(String [] args)
	{
	 Scanner input = new Scanner(System.in);

	 String code = input.nextLine();
	 char major = code.charAt(0);
	 char status = code.charAt(1);
	 System.out.println(findMajor(major)+ " : " + findStatus(status));

	 System.exit(0);
	}
	
	public static String findMajor(char firstChar) {
		String major = "Invalid Major";
		 if (firstChar == 'M') 
		        major =  "Mathematics";
		    else if (firstChar == 'C')
		        major =  "Computer Science";
		    else if (firstChar == 'I')
		        major = "Information Technology";
		 
		 return major;
	}
	public static String findStatus(char secondChar)
    {
		String status = "Invalid Status";
		if (secondChar == '1')
			status = "Freshman";
		else if (secondChar == '2')
			status = "Sophomore";
		else if (secondChar ==  '3')
           status = "Junior";
		else if (secondChar == '4')
            status = "Senior";
		
		return status;
    }
}
