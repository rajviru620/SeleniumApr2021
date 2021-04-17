package week2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* a) Declare A String value as"madam"
		
		String str1 ="madam";
		String str2 ="";
		System.out.println(str1.length());
		char[] ch = str1.toCharArray();
		for (int i = str1.length()-1; i >=0; i--) 
		{
			str2=str2+ch[i];
			
		}
		System.out.println(str2);
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is Not a Palindrome");
		}
//	 
//	 * b) Declare another String rev value as ""
//	 * c) Iterate over the String in reverse order
//	 * d) Add the char into rev
//	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
//	 
//	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	}

}
