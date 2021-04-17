package week1.day2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to know the path of the location
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		//Open the browser
		
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ross");
		driver.findElementById("createLeadForm_lastName").sendKeys("Taylors");
		
//				1. Select Industry Value as "Finance" using visible text
//		2. Select Source value as "Employee" using selectByValue
		
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement industry= driver.findElementById("createLeadForm_industryEnumId");
		Select ind = new Select(industry);
		ind.selectByVisibleText("Finance");

//		
		driver.findElementByClassName("smallSubmit").click();
		
		
//		5. Click Leads link
//		6. Click Create Lead link
//		7. Enter Company Name
//		8. Enter FirstName
//		9. Enter LastName
//		10. Click Create Lead button
	}

}
