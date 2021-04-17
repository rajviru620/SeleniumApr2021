package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		Duplicate Lead:
//			1	Launch the browser
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
//			5	Click crm/sfa link
//			6	Click Leads link
//			7	Click Find leads
//			8	Click on Email
//			9	Enter Email
//			10	Click find leads button
//			11	Capture name of First Resulting lead
//			12	Click First Resulting lead
//			13	Click Duplicate Lead
//			14	Verify the title as 'Duplicate Lead'
//			15	Click Create Lead
//			16	Confirm the duplicated lead name is same as captured name
//			17	Close the browser (Do not log out)
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[@class='x-tab-strip-text ' and text()='Email']").click();
		
		driver.findElementByName("emailAddress").sendKeys("check@testleaf.com");
		
		driver.findElementByXPath("//button[@type='button' and text()='Find Leads']").click();
		
		Thread.sleep(2000);
		WebElement leadID = driver.findElementByXPath("(//tr//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a");
		String textID = leadID.getText();
		System.out.println(textID);
		
		WebElement fName = driver.findElementByXPath("(//tr//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName '])[1]//a");
		String fNtext = fName.getText();
		System.out.println(fNtext);
		
		fName.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("Duplicate Lead").click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.findElementByClassName("smallSubmit").click();
		
		String fName1 = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(fName1);
		
		String viewCompN1 = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(viewCompN1);
		
		if (fNtext==fName1) {
			if (viewCompN1.contains(textID)) {
				System.out.println("Lead NOT Duplicated successfully");
			}
		} else {
			System.out.println("Lead Duplicated successfully");
		}
		
		
	}

}
