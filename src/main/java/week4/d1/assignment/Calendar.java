package week4.d1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Calendar.html");
		//WebElement tb = driver.findElementByClassName("ui-datepicker-calendar");
		WebElement dp = driver.findElementById("datepicker");
		Actions act = new Actions(driver);
		act.moveToElement(dp).click().build().perform();
		
		dp.sendKeys("03/10/2021");
		
		WebElement Date = driver.findElementByXPath("//a[@class='ui-state-default ui-state-highlight']");
		act.moveToElement(Date).click().build().perform();
		dp.click();
		dp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
		driver.quit();
	}

}
