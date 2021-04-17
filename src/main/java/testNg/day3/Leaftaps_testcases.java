package testNg.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Leaftaps_testcases {

	@Test
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test
	public void editLead() {
		System.out.println("Edit Lead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	

	@Test(retryAnalyzer = testNg.day3.RetryFailedTestCases.class)
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
	
}
