package testNg.day2;

import org.testng.annotations.Test;

public class LearnDependancyIjection {
	
	
	@Test(dependsOnMethods ="testNg.day2.LeadsTestCases.createLead" ,alwaysRun = true)
	public void DuplicateLead() {
		System.out.println("Duplicate Lead");
	}
}
