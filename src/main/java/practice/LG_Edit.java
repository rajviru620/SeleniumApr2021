package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("email").sendKeys("Test@123.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Text Appended",Keys.TAB);
		String text = driver.findElementByXPath("//input[@name='username'][1]").getText();
		System.out.println(text);
		
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		
		WebElement ele = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[5]//input");
		boolean b = ele.isEnabled();
		if (b==true) {
			System.out.println("Element is enabled");
						
		} else {
			System.out.println("Element is disabled");
		}
		
		driver.close();
	}

}
