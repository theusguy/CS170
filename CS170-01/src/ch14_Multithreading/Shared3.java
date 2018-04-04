package ch14_Multithreading;

import java.util.*;

public class Shared3 {
	//Setting instance variables with volatile setting to make sure methods reach the correct value
	static final int SIZE = 20;
	static volatile int nums[] = new int[SIZE];
	static volatile int first;
	static volatile int last;
	static volatile boolean ready;
	//making sure only one method accessing this methods at a time.
	public synchronized void sorting() {
		try {
			if(!ready) {
				for (int i = 0; i < nums.length; i++) {
					nums[i] = (int)(Math.random()*10000);
				}
				
				Arrays.sort(nums);
				for (int num : nums) {
					System.out.print(num + " ");
				}
				System.out.println();
				
				first = nums[0];
				last =  nums[SIZE-1];
				ready = true;
				
				wait();
			} else {
				ready = false;
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public synchronized void printing() {
		if (ready) {
			notifyAll();
			System.out.println("the first number: " + first);
			System.out.println("the last number: " + last);
			
		}
	}

}
