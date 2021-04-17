package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@BeforeSuite
	public void setUP() {
		System.out.println("set up the chrome");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Open the Browser");
	}
	
	
	@BeforeClass
	public void launchURL() {
		System.out.println("Launch the URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to app");
	}
	
	@Test(priority =1, invocationCount = 2)
	public void googleTitle() {
		System.out.println("Test 1 google ");
	}
	
	@Test(priority =2)
	public void FbTitle() {
		System.out.println("Test 2 FB ");
	}
	@Test(expectedExceptions =NumberFormatException.class)
	public void AmazonTitle() {
		System.out.println("Test 3 Amazon ");
		throw new NumberFormatException();
		
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout of app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterSuite
	public void reports() {
		System.out.println("Generate reports");
	}
	
	
	
	
}
