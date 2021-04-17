package steps;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

public class DeleteLead extends BaseClass{
	public String leadID;
	@Given("Click Find Leads Link for Delete")
	public void clicked_find_leads_link_For_Delete() {
		driver.findElementByLinkText("Find Leads").click();
		
	}
	
	@Given("Clicked the Phone number for Delete")
	public void clicked_the_phone_Number_for_delete() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		
	}
	
	
	@Given("Entered the phone number for Delete {string}")
	public void enter_the_phone_Number_for_Delete(String phNo) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phNo);
		
	}

	@Given("CLicks the find link button for Delete")
	public void c_licks_the_find_link_button_for_Delete() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
	}
	
	@Given("Get the first link details for Delete")
	public void get_the_first_link_details_for_Delete() {
		 leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
	}
	
	@Given("Click the Delete button")
	public void click_the_Delete_Button() {
		driver.findElementByLinkText("Delete").click();
		
	}
	
	
	@Given("Clicking the findLeads link again")
	public void c_licks_the_findLeads_link_Again()  {
		driver.findElementByLinkText("Find Leads").click();
		
		
	}
		
		@Given("Enter the lead ID")
		public void enter_the_lead_ID() {
			driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
			
		}
	
		@Given("Clicking the findLead button again")
		public void c_licks_the_findLead_Button_Again() throws InterruptedException {
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
		}
		
		@Given("No records found should display")
		public void NoRecords_display() {
			String actText = driver.findElementByClassName("x-paging-info").getText();

			String expText = "No records to display";
			SoftAssert softAssert =  new SoftAssert();
			softAssert.assertEquals(actText, expText);
			
			softAssert.assertAll();
		}



}
