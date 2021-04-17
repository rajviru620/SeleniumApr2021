package week2.day1;

public class ArmstrongNumber {

	
	public static void arm(int num) {
		int calculated=0;
		int remainder;
		int original ;
		original =num;
		
		while(num>0)
		{
		remainder = num%10;
		num =num/10;
		calculated =calculated + (remainder *remainder * remainder);
		}
		
		if(original==calculated) {
			System.out.println("This is Armstrong number");
		}
		else {
			System.out.println("This is not Armstrong number");
		}
		
				
	}
	
	public static void main(String[] args) {
		arm(153);
		
			// Declare your input

			// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
			// Assign input into variable original 
			// Use loop to calculate: use while loop to set condition until the number greater than 0
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			// Check whether calculated and original are same
			//When it matches print it as Armstrong number


			



			

			

			

			



		




	}

}
