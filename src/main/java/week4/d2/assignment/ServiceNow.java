package week4.d2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
		driver.findElementByXPath("//input[@name='user_password']").sendKeys("India@123");
		driver.findElementByXPath("//button[@type='submit']").click();
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement all = driver.findElementByXPath("(//div[text()='All'])[2]");
		act.moveToElement(all).click().build().perform();
		
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[@type='submit' and text()='New']").click();
		Thread.sleep(2000);		
		WebElement incNbr = driver.findElementById("incident.number");
		incNbr.click();
		String str= incNbr.getAttribute("value");
		//String incidentNumber = str.replaceAll("\\s", "");
		String incidentNumber = str.trim();
		System.out.println(incidentNumber);
		incNbr.sendKeys(Keys.TAB);
		WebElement caller = driver.findElementById("sys_display.incident.caller_id");
		caller.sendKeys("Hari");
		Thread.sleep(2000);
		caller.sendKeys(Keys.DOWN,Keys.ENTER);
		
		
		String descEnter ="Description entered by Test";
		driver.findElementById("incident.short_description").sendKeys(descEnter);
		driver.findElementByXPath("//button[@type='submit'][1]").click();
		Thread.sleep(2000);
		
		WebElement search = driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input[1]");
		//act.moveToElement(search).click().build().perform();
		search.sendKeys(incidentNumber,Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement desc = driver.findElementByXPath("//table[@id='incident_table']//tbody//tr//td[3]//a");
		String descText = desc.getText();
		System.out.println(descText);
		if (descEnter.equalsIgnoreCase(descText)) {
			System.out.println("Verified successfully");
		} else {
			System.out.println("Not Verified successfully");
			
		}
	}

}
