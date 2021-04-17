package testNg.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeadsTestCases {
	
	@Test(priority=1)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods = "createLead")
	public void editLead() {
		System.out.println("Edit Lead");
		//throw new NoSuchElementException();
	}
	
	@Test(dependsOnMethods = {"createLead","editLead"})
	public void DeleteLead() {
		System.out.println("Delete Lead");
	}
	

}
