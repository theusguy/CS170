import java.util.Scanner;

public class FactorialPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int numFactorial = scan.nextInt();
		int total = 1;
		quit:
			for (int counter = 25; counter >=0; counter--) {
				if (numFactorial == 0) {
					break quit;
				}
				total*=numFactorial;
				numFactorial--;
			}
		
		System.out.println(total);
	}
	
}
