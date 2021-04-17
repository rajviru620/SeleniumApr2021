package week1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='email']").sendKeys("rajviru620@gmail.com");
		WebElement append = driver.findElementByXPath("//input[@value='Append ']");
		append.clear();
		append.sendKeys("Appended the text",Keys.TAB);
		
		WebElement text = driver.findElementByXPath("(//input[@type='text'])[3]");
		
		String text2 = text.getAttribute("value");
		System.out.println(text2);
		
		
		Thread.sleep(1000);
		WebElement clearField = driver.findElementByXPath("//input[@value='Clear me!!']");
		clearField.sendKeys(Keys.ENTER);
		clearField.clear();
		
		boolean enabled = driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
		if(enabled==true)
		{
			System.out.println("Field is enabled");
		}
		else {
			System.out.println("Field is disabled");
		}
		
				

	}

}
