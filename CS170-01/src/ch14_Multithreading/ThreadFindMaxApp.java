package ch14_Multithreading;

public class ThreadFindMaxApp {
	public static void main(String[] args) {
		//2-D Array Bounds
		final int ROW = 100,
				  COL = 200;
		long startTime = 0,
			 endTime = 0;
		
		//Creating a single dimension array of same length
		MaxThread[] eachMaxThread = new MaxThread[ROW];
		//Generating the whole 2-D array with values
		double[][] matrix = Matrix.generator(ROW, COL);
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < eachMaxThread.length; i++) {
			eachMaxThread[i] = new MaxThread(matrix[i]);
			eachMaxThread[i].start();
		}
		
		try {
			startTime = System.currentTimeMillis();
			System.out.println("start time: " + startTime);
			for (int i = 0; i < eachMaxThread.length; i++) {
				eachMaxThread[i].join();
				max = Math.max(max,  eachMaxThread[i].getMax());
			}
			endTime = System.currentTimeMillis();
			System.out.println("end time: " + endTime);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Max of the matrix is: " + max);
		System.out.println("Completion Time: " + (endTime - startTime));
	}
}

//Thread class
class MaxThread extends Thread {
	//Creating a holder variable for array and max value
	private double max = Double.MIN_VALUE;
	private double[] eachArray;
	
	//Constructor designed to bring in an array for testing 
	//whenever MaxThread Object created
	public MaxThread(double[] eachArray) {
		this.eachArray = eachArray;
	}
	
	//When thread is started and runs..it loops through the 
	//array comparing each element with max's value
	public void run() {
		for (int i = 0; i < eachArray.length; i++) {
			max = Math.max(max, eachArray[i]);
		}
	}
	
	public double getMax() {
		return max;
	}
}

class Matrix {
	public static double[][] generator(int row, int col) {
		double[][] matrix = new double[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = Math.random() * 101;
			}
		}
		return matrix;
	}
}

//Reason why this is faster than solving for max value in 2-d array without threads is that in this 
//example, each column has its own thread solving to find max at the same times then make compare the array 
//of max values in every col to find the true max value. Without threads you would manually go over each element
//one by one and then find max.
