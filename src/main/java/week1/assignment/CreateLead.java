package week1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		*
//		 * //Pseudo Code
//		 * 
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 
//		 * 2. Enter UserName and Password Using Id Locator
//		 * 
//		 * 3. Click on Login Button using Class Locator
//		 * 
//		 * 4. Click on CRM/SFA Link
		 
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
//		 * 
//		 * 5. Click on Leads Button
//		 * 
//		 * 6. Click on create Lead Button
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();

//		 * 7. Enter CompanyName using id Locator
//		 * 8. Enter FirstName using id Locator
//		 * 9. Enter LastName using id Locator
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Monica");
		driver.findElementById("createLeadForm_lastName").sendKeys("Geller");
		

//		 * 10. Select value as Employee in Source Using SelectbyVisible text
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select src = new Select(source);
		src.selectByVisibleText("Employee");
		
//		 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement campaign= driver.findElementById("createLeadForm_marketingCampaignId");
		Select adv = new Select(campaign);
		adv.selectByValue("9001");
		
		
//		 * 
//		 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		
		WebElement corporation= driver.findElementById("createLeadForm_ownershipEnumId");
		Select own = new Select(corporation);
		own.selectByIndex(5);;
		
//		 * 14. Select value as India in Country Field Using SelectbyVisibletext
		WebElement country= driver.findElementById("createLeadForm_generalCountryGeoId");
		Select ind = new Select(country);
		ind.selectByVisibleText("India");
	
//		 * 15. Click on create Lead Button Using name Locator
		driver.findElementByName("submitButton").click();
//		 * 16. Get the Title of the resulting Page
		String title 	= driver.getTitle();
		System.out.println(title);
		
	}

}
