package testcase;

import org.testng.annotations.Test;

public class TestNGAttributes {
	@Test(priority=1, invocationCount=2)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority=3, invocationCount=1)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(priority=2, invocationCount=3)
	public void DeleteLead() {
		System.out.println("Delete Lead");
	}
	
	@Test(priority=4, enabled=false)
	public void DuplicateLead() {
		System.out.println("Duplicate Lead");
	}

}
