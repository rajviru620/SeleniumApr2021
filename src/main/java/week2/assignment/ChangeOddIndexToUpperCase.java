package week2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Declare String Input as Follow
		  
		 String test = "changeme";
		 
//		a) Convert the String to character array
//		b) Traverse through each character (using loop)
//		c)find the odd index within the loop (use mod operator)
//		d)within the loop, change the character to uppercase, if the index is odd else don't change
		 char ch[] = test.toCharArray();
		 for (int i = 0; i < ch.length; i++) {
			 if (i%2==0) {
					System.out.print(ch[i]);
				
					 
				 } 
			 if (i%2!=0) {
				System.out.print(Character.toUpperCase(ch[i]));
			
				 
			 }
		}
	}

}
