package testNg.day3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LearnTestNgAssertion {
	
	@Test
	public void leafTapsLogin() {
	
	String expTitle ="TestLeaf Automation Platform";	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new  ChromeDriver();
//	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@type='submit']").click();
	
	String actTitle = driver.getTitle();
	//Hard assert 
	//Assert.assertEquals(actTitle, expTitle);
	
	//softAssert
	//Assertion 1
	SoftAssert softAssert  = new SoftAssert();
	softAssert.assertEquals(actTitle, expTitle);
	
	//Assertion 2
	boolean displayed = driver.findElementByXPath("//div[@class='crmsfa']//div//a").isDisplayed();
	softAssert.assertTrue(displayed);
	driver.findElementByXPath("//div[@class='crmsfa']//div//a").click();
	driver.findElementByXPath("//div[@class='x-panel-header']//a[text()='Leads']").click();

	//asserrAll will consolidate All results
	softAssert.assertAll();
	
	
	}
}
