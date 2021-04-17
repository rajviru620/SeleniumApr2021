package week1.day1;

public class GlobalVariables {
	
//	mobileModel (with String data type)
	String mobileModel = "Oneplus 7T";
//    mobileWeight (with int data type)
	int mobileWeight = 180;
	
//    isFullCharge (with boolean data type)
		boolean isFullCharge =true;
		
//    mobileCost (with double datatype)
	double mobileCost = 40000d;
	
	//Call all the global variables from main method and print all values in console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariables specifications = new GlobalVariables();
		String model = specifications.mobileModel;
		System.out.println(model);
		
		System.out.println(specifications.mobileWeight);
		System.out.println(specifications.mobileCost);
		System.out.println(specifications.isFullCharge);
		
		
		
		
	}

	

}
