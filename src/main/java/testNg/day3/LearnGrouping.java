package testNg.day3;



import org.testng.annotations.Test;

public class LearnGrouping {
	
	@Test(groups= {"functional","smoke"})
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(groups= "smoke")
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	
	@Test(groups= {"functional","regression"})
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	@Test(groups= "regression", dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	

	@Test(groups= "regression")
	public void mergeLead() {
		System.out.println("Merge Lead");
	}

}
