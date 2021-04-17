package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends Baseclass{
	public String leadID1;
	@BeforeClass
	public void setFileName() {
		excelFileName ="DeleteLead";
	}
	
	@Test(dataProvider = "fetchData")
	public  void runDeleteLead(String PhNo)  throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(PhNo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String actText = driver.findElementByClassName("x-paging-info").getText();
//		if (text.equals("No records to display")) {
//			System.out.println("Text matched");
//		} else {
//			System.out.println("Text not matched");
//		}
		String expText = "No records to display";
		SoftAssert softAssert =  new SoftAssert();
		softAssert.assertEquals(expText, actText,"Successfully Deleted");
		System.out.println(actText);
		//softAssert.assertAll();
		
		
}
}






