package steps;

import io.cucumber.java.en.Given;


public class EditLead extends BaseClass{
	

	@Given("Clicking Find Leads Link")
	public void clicking_find_leads_link() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	
	@Given("Click the Phone number")
	public void click_the_phone_Number() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		
	}
	
	
	@Given("Enter the phone number {string}")
	public void enter_the_phone_Number(String phNo) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phNo);
		
	}

	@Given("CLicking the find link button")
	public void c_licking_the_find_link_button() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
	}
	
	@Given("clicked the first link")
	public void clicked_the_first_link() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
	}
	
	@Given("Click the Edit button")
	public void click_the_Edit_Button() {
		driver.findElementByLinkText("Edit").click();
		
	}
	
	
	@Given("Update the company name {string}")
	public void update_the_comp_name(String companyName) { 
		driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
		
	}
	
	@Given("click the submit button")
	public void click_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByName("submitButton").click();
	}
	
	@Given("Lead page should display")
	public void lead_page_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
