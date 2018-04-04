
public class SquareCubeTable {	
	
	public void tableTitle() {
		System.out.println("Number\tSquare\tCube");
	}
	
	public void tableData(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
		}
	}
}
