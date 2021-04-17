package week2.assignment;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";
					
					// declare and initialize a variable count to store the number of occurrences
					int count =0;
					// convert the string into char array
						char ch[] =str.toCharArray();
						
					//get the length of the array
						System.out.println(ch.length);
					// traverse from 0 till the array length 
						for (int i = 0; i < ch.length; i++) 
						{
							if (ch[i]=='e') {
								count++;
							}
						}
						 
						// print the count out of the loop
						System.out.println(count);
						
	}

}
