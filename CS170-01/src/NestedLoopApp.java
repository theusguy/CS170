import java.util.Scanner;

public class NestedLoopApp {

	public static void main(String[] args) {
		SquareCubeTable table = new SquareCubeTable();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter starting number");
		int start = scan.nextInt();
		
		System.out.println("Please enter ending number");
		int end = scan.nextInt();
		
		
		table.tableTitle();
		
		table.tableData(start, end);
	}

}
