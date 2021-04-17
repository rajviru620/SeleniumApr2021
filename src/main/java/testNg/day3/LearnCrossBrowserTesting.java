package testNg.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCrossBrowserTesting {

	RemoteWebDriver driver;
	@Parameters({"browser"})
	@Test
	public void createLead(String browserName) {
		
		if(browserName.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new  ChromeDriver();
		}
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new  EdgeDriver();
				}
		
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new  FirefoxDriver();
				}
//	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByXPath("//div[@class='crmsfa']//div//a").click();
	driver.findElementByXPath("//div[@class='x-panel-header']//a[text()='Leads']").click();
}
	
}
