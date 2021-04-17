package week2.day2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new  ChromeDriver();
//		WebDriverManager.iedriver().setup();
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver = new FirefoxDriver();
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		*
//		 Use Xpath for all elements
		 
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("//div[@class='crmsfa']//div//a").click();
//		 * 
//		 * 5. Click on Leads Button
//		 * 
//		 * 6. Click on create Lead Button
		driver.findElementByXPath("//div[@class='x-panel-header']//a[text()='Leads']").click();
		
		driver.findElementByXPath("//ul[@class='shortcuts']//a[text()='Create Lead']").click();

//		 * 7. Enter CompanyName using id Locator
//		 * 8. Enter FirstName using id Locator
//		 * 9. Enter LastName using id Locator
		
		driver.findElementByXPath("//input[@name='companyName' and @class='inputBox']").sendKeys("Cognizant");
		driver.findElementByXPath("//input[@name='firstName' and @class='inputBox']").sendKeys("Ross");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Geller");
		


	
//		 * 15. Click on create Lead Button Using name Locator
		driver.findElementByXPath("//input[@name='submitButton']").click();
//		 * 16. Get the Title of the resulting Page
		String title 	= driver.getTitle();
		System.out.println(title);
	}

}
