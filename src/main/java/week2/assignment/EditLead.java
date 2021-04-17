package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
//		Edit Lead:
//			1	Launch the browser
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
//			5	Click crm/sfa link
//			6	Click Leads link
//			7	Click Find leads
//			8	Enter first name as Gopi
//					Thread.sleep(2000)
//			9	Click Find leads button
//			10	Click on first resulting lead
//			11	Verify title of the page
//			12	Click Edit
//			13	Change the company name
//			14	Click Update
//			15	Confirm the changed name appears
//			16	Close the browser (Do not log out)
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		
		driver.findElementByXPath("//button[@type='button' and text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//tr//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName '])[1]//a").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.findElementByLinkText("Edit").click();
		
		WebElement updateComName = driver.findElementById("updateLeadForm_companyName");
		updateComName.clear();
		updateComName.sendKeys("KGF");
		
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		WebElement viewComName = driver.findElementById("viewLead_companyName_sp");
		String text = viewComName.getText();
		System.out.println(text);
		if (text.contains("KGF")) {
			System.out.println("Company Name changed");
		} else {
			System.out.println("Company Name NOT changed");
		}
		
		driver.quit();
		
	}

}
