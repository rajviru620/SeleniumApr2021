package steps;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LeaftapsLogin extends BaseClass {
	
	
	
	@Given("Enter username as {string}")// instead of enter value , curly brace string will get data from feature file
	public void enterUserName(String username) {
	driver.findElementById("username").sendKeys(username);
	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
	driver.findElementById("password").sendKeys(password);
	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		System.out.println("Homepage is displayed");
	}
	
	@But("Error Message should be displayed")
	public void errorMessageDisplayed() {
		System.out.println("Error message is displayed");
	}
	
	
}
