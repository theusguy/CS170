package ch10_ArrayAndStrings;

public class ArrayReturnTest {
	public static void main(String[] args) {
		double[] firstArray = { 89.2, 192.09, 87.77, 299.102, 920.02, 82.2 };
		double[] secondArray = { 0.934, 0.087, 0.056, 0.0625 };
		
		double[] combinedArray = new double[firstArray.length + secondArray.length];
		
		//Putting firstArray
		for(int first = 0; first < firstArray.length; first++) {
			combinedArray[first] = firstArray[first];
		}
		
		for (int second = 0; second < secondArray.length; second++) {
			combinedArray[firstArray.length + second] = secondArray[second];
		}
		
		for (double element: combinedArray) {
			System.out.print(element + " ");
		}
		
	}

}
