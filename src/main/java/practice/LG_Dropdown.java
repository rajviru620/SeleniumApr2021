package practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Drop down").click();
		
		WebElement dd1 = driver.findElementById("dropdown1");
		Select sel = new Select(dd1);
		sel.selectByIndex(1);
		
		WebElement dd2 = driver.findElementByName("dropdown2");
		Select sel2 = new Select(dd2);
		sel2.selectByVisibleText("Appium");
		
		WebElement dd3 = driver.findElementById("dropdown3");
		Select sel3 = new Select(dd3);
		sel3.selectByValue("3");

		WebElement dd4 = driver.findElementByClassName("dropdown");
		Select sel4 = new Select(dd4);
		List<WebElement> options = sel4.getOptions();
		int count = options.size();
		System.out.println(count);
		
		
		WebElement dd5 = driver.findElementByXPath("(//div[@class='example'])[5]/select");
		
		dd5.sendKeys("Selenium",Keys.ARROW_DOWN);
		dd5.click();
		Actions act = new Actions(driver);
		
		WebElement dd6 = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		Select sel6 = new Select(dd6);
		
		boolean b = sel6.isMultiple();
		if (b==true) {
			act.sendKeys(dd6,Keys.CONTROL);
			sel6.selectByIndex(1);
			sel6.selectByVisibleText("UFT/QTP");
			
		} else {
			sel6.selectByValue("4");
		}
		
		
		
		driver.close();
	}

}
