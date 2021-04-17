package week2.special;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
//		1. Launch the URL  "https://www.amazon.in/"
//		2. Maximize the Browser
		
		driver.get("https://www.amazon.in/");
		
//		3. Click on Search bar and Type Alexa Speakers,Press Enter 
		
		WebElement searchBox = driver.findElementById("twotabsearchtextbox");
		searchBox.sendKeys("Alexa Speakers",Keys.ENTER);
		
//		4. Get the Name of First Resulting Speaker
		
		WebElement result = driver.findElementByXPath("//span[contains(@class,'a-size-medium a-color-base')]");
		String text = result.getText();
		System.out.println(text);
		
//		5.  Get the Price of Speaker
		
		WebElement price = driver.findElementByXPath("//span[@class='a-price-whole']");
		String priceAmount = price.getText();
		System.out.println(priceAmount);
		
//		6. Check Whether it is Free Delivery With Amazon

		WebElement delivery = driver.findElementByXPath("//span[text()='FREE Delivery by Amazon']");
		boolean displayed = delivery.isDisplayed();
		if (displayed==true) {
			System.out.println("Free delivery available");
		} else {
			System.out.println("Free delivery not available");
		}
		
//     7.Minimize the Browser (Note: Do Not Close)
		driver.manage().window().minimize();
		
	}

}
