package week3.assignment;

public class Desktop implements Hardware,Software{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dp = new Desktop();
		dp.softwareResources();
		dp.hardwareResources();
	
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software from Soft");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware form Hard");
		
	}

}
