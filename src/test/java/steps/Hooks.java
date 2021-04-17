package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{

	@Before
	public void preCondition() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			Thread.sleep(2000);
			driver.findElementByLinkText("CRM/SFA").click();
			
			driver.findElementByLinkText("Leads").click();
		
	}
	
	@After
	public void postCondition() {
		
		driver.close();
	}
	
}
