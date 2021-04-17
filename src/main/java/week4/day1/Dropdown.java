package week4.day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByLinkText("Drop down").click();
		
		
		
		WebElement qMultiple = driver.findElementByXPath("//div[@class='example'][6]/select");
		Select dd6 = new Select(qMultiple);
		boolean multiple = dd6.isMultiple();
		if(multiple==true)
		{
			System.out.println("This field is multiple selected");
		}
		else
		{
			System.out.println("This field is not multiple selected");
		}
		qMultiple.sendKeys(Keys.CONTROL);
		dd6.selectByValue("2");
		dd6.selectByValue("4");
	}

}
