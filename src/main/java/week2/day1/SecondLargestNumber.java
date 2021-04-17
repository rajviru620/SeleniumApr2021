package week2.day1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				Arrays.sort(data);
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i]);
					
				}
				System.out.println("******************");
				System.out.println("Secong largest number is: "+data[data.length-2]);
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
	}

}
