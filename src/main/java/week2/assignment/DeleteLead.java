package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		Delete Lead:
//			1	Launch the browser
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
//			5	Click crm/sfa link
//			6	Click Leads link
//			7	Click Find leads
//			8	Click on Phone
//			9	Enter phone number 99
//			10	Click find leads button
//			11	Capture lead ID of First Resulting lead
//			12	Click First Resulting lead
//			13	Click Delete
//			14	Click Find leads
//			15	Enter captured lead ID
//			16	Click find leads button
//			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//			18	Close the browser (Do not log out)
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[@class='x-tab-strip-text ' and text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		WebElement leadID = driver.findElementByXPath("(//tr//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a");
		String textID = leadID.getText();
		System.out.println(textID);
		leadID.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("Delete").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(textID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String verifyRecord = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(verifyRecord);
		if (verifyRecord.contains("No records")) {
			
			System.out.println("Lead deleted successfully");
			
		} else {
			System.out.println("Lead not deleted successfully");
		}
		
		
		
		
	}

}
