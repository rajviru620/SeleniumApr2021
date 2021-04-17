package week1.day1;


//- Create package name as week1.day1
//- Create a  new class as "Mobile" under week1.day1

public class Mobile {

//- Create 2 methods (makeCall() , sendMsg()) with simple print statement
	
	public void makeCall() {
		System.out.println("Making a Call from Phone");
	}
	
	public void sendMsg() {
		System.out.println("Sending a Message from Phone");
	}
	
//- Create main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//- Create object for Mobile class and call the methods using the object	
		Mobile myPhone = new Mobile ();
		
		//- Execute the class and get the result in console
		myPhone.makeCall();
		myPhone.sendMsg();
		

	}

}
