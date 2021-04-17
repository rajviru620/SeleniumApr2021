package testcase;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DuplicateLead  extends Baseclass{
	
	@BeforeClass
	public void setFileName() {
		excelFileName ="DuplicateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public  void runDuplicateLead(String PhNo)  throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(PhNo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		
}
}






