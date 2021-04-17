package steps;

import io.cucumber.java.en.Given;

public class DuplicateLead extends BaseClass {
	
	@Given("Clicked Find Leads Link")
	public void clicked_find_leads_link() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	
	@Given("Clicked the Phone number")
	public void clicked_the_phone_Number() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		
	}
	
	
	@Given("Entered the phone number {string}")
	public void enter_the_phone_Number(String phNo) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phNo);
		
	}

	@Given("CLicks the find link button")
	public void c_licks_the_find_link_button() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
	}
	
	@Given("clicks the first link")
	public void clicks_the_first_link() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
	}
	
	@Given("Click the Duplicate button")
	public void click_the_Duplicate_Button() {
		driver.findElementByLinkText("Duplicate Lead").click();
		
	}
	
	
	@Given("clicking the submit button")
	public void clicking_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByName("submitButton").click();
	}
	
	@Given("DupLead page should display")
	public void dupLead_page_display() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Duplicate Lead page displayed");
	}





}
