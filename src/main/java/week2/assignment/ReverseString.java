package week2.assignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "feeling good";

				// Build the logic to find the count of each
//				 Pseudo Code: 1
//					a) Convert the String to character array
//					b) Traverse through each character (using loop in reverse direction)
//					c) Print the character (without newline -> like below
					  // System.out.print(ch);
					 char ch[] = test.toCharArray();
					 for (int i = ch.length-1; i >=0; i--) {
						System.out.print(ch[i]);
					}
					  System.out.println("******"); 
				/* Pseudo Code: 2
				a) Find the length of the string
				b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
				c) Find the character of the String using its index
				*/
				int len = test.length();
				System.out.println(len);
				for (int i =len-1; i >=0; i--) {
					System.out.print(test.charAt(i));
				}
					 
	}

}
