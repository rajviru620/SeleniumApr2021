package week2.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int size = arr.length;
		System.out.println(size);
		System.out.println("*********************");
		Arrays.sort(arr);
		for (int eachvalue : arr) {
			System.out.println(eachvalue);
		}
		System.out.println("*********************");
		// declare an int variable named count
		int count=0;
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			
			
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					System.out.println(arr[i]);
					count=count+1;
					
				}
				
			}
		}
		System.out.println("the count is:"+count);
		
		
		
	}

}
