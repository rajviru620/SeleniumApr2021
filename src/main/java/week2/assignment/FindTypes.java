package week2.assignment;

public class FindTypes 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				/* Pseudo Code:
					a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				*/
				char[] ch = test.toCharArray();
				for (int i = 0; i < ch.length; i++) 
				{
					
					if(Character.isLetter(ch[i])) 
					{
						System.out.println(ch[i]);
						letter++;
					}
					
					else if (Character.isDigit(ch[i])) 
					{
					
						System.out.println(ch[i]);
						num++;
							
					}
					
					else if (Character.isSpaceChar(ch[i])) 
					{
					
						System.out.println(ch[i]);
						space++;
							
					}
					else 
					{
						System.out.println(ch[i]);
						specialChar++;
					}
				}
				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}
	
}
