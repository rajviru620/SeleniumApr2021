package week3.assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		
//		get the length of the array		
		System.out.println(input.length);
//		sort the array			
		Arrays.sort(input);
		System.out.println("Newly sorted array:-  ");
		for (String eachValue : input) {
			System.out.println(eachValue);
		}
		
		System.out.println("******************");
		System.out.println("Sorted array in reverse order:- ");

//		Iterate it in the reverse order
		for (int i = input.length-1; i >=0 ; i--) {
			System.out.println(input[i]);
			
		}
//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
