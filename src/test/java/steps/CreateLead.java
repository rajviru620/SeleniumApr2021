package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	


//	
//	@Given("Enter the username as {string}")
//	public void enter_the_username_as(String username) {
//	   		driver.findElementById("username").sendKeys(username);
//	}
//	
//	@Given("Enter the password as {string}")
//	public void enterThePassword(String password) {
//	driver.findElementById("password").sendKeys(password);
//	}
//	
//	@When("Click on the Login button")
//	public void clickTheLoginButton() {
//	driver.findElementByClassName("decorativeSubmit").click();
//	}
//	
//	@Then("The HomePage should be displayed")
//	public void verifyHomePage() {
//		System.out.println("Homepage is displayed");
//	}
//
//	@Given("Click on crmsfa link")
//	public void clickCrmsfaLink() {
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//	
//	@Given("Click on Leads link")
//	public void clickLeadsLink() {
//		
//		driver.findElementByLinkText("Leads").click();	
//	}
	
	@Given("Click Create Lead link")
	public void click_create_lead_link() {
		driver.findElementByLinkText("Create Lead").click();
		  
	    
	}
	
	@When("Enter company name as {string}")
	public void enter_company_name_as(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		 
	}
	
	@Given("Enter first name as {string}")
	public void enter_first_name(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		
	}
	
	@Given("Enter last name as {string}")
	public void enter_last_name(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		
	}
	
	@When("Click the Create Lead button")
	public void click_CreateLead_button() {
		driver.findElementByName("submitButton").click(); 
	}
	
	@Then("LeadPage should be displayed")
	public void leadPage_displayed() {
		System.out.println("LeadPage displayed");
	}
	
}
