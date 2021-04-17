package week2.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 * a) Use the declared String text as input
		
		String text = "We learn java basics as part of java sessions in java week1";		
// * b) Initialize an integer variable as count
		int count =0;
		
// * c) Split the String into array and iterate over it
		
		String[] str = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			//System.out.println(str[i]);
			for (int j = 1; j < str.length; j++) {
				if (str[i]==str[j]) {
					System.out.println(str[i]);
					count++;
					
				}
			}
		}
//		for (String eachString : str) {
//			System.out.println(eachString);
//		}
		
// * d) Initialize another loop to check whether the word is there in the array
// * e) if it is available then increase and count by 1. 
// * f) if the count > 1 then replace the word as "" 
// 
// * g) Displaying the String without duplicate words
	}

}
