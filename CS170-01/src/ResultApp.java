import java.util.Scanner;

public class ResultApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Result result = new Result();
//		String keepGoing = "y";
//		do {
//			System.out.println("Please enter a score: ");
//			int num = scan.nextInt();
//			result.ifElseVersion(num);
//			String resultStatus = result.getResult();
//			System.out.println("Looks like you..." + resultStatus);
//			System.out.println("Would you like to keep going?");
//			keepGoing = scan.next();
//		} while (keepGoing.equalsIgnoreCase("y"));
//		

double discountAmount = 0.0;

int orderTotal = 200;

if (orderTotal > 200)

    discountAmount = orderTotal * .3;

else if (orderTotal > 100)

            discountAmount = orderTotal * .2;

        else discountAmount = orderTotal * .1;

System.out.println(discountAmount);
	}
	
	

}
