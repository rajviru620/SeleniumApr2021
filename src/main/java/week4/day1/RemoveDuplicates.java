package week4.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.internal.runners.model.EachTestNotifier;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declare a String as PayPal India
		String s = "PayPal India";

//		Convert it into a character array
		char [] charArray = s.toCharArray();
		
		
//		Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
//		
//		
		for (Character eachCharA : charArray) {
			charSet.add(eachCharA);
			
		}
		for (Character ch : charSet) {
			if (ch!=' ') {
				System.out.println(ch);
			}
		}
		
		
	}

}
