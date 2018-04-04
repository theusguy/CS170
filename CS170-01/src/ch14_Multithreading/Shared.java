package ch14_Multithreading;

	import java.util.*;

	public class Shared {
		static final int SIZE = 100;
		static volatile int nums[] = new int[SIZE];
		static volatile int first = 0;
		static volatile int last = 0;
		static volatile boolean ready = false;
		public void sorting() {
			ready = false;
			for(int i = 0; i < nums.length; i++) {
			 nums[i] = (int)(Math.random()*10000);
			}

			Arrays.sort(nums);
			for(int num : nums)
			 System.out.print(num + " ");
			System.out.println();

			first = nums[0];
			last = nums[SIZE-1];
			ready = true;

		}
		public void printing() {
			if (ready) {
				System.out.println("the first number: " + first);
				System.out.println("the last number: " + last);
			}
		}
	}

