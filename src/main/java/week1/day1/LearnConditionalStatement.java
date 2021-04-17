package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =25;
		
		if (age<18) {
			
			System.out.println("Minor");
			System.out.println("Not Eligible to Vote");
		}
		else if(age >=18 && age <60 ){

			System.out.println("Adult");
			//System.out.println("Major");
			//System.out.println("Eligible to vote");
		}
			
		else {
			System.out.println("Senior citizen");
		}
	}

}
