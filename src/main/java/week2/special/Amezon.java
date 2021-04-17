package week2.special;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon {

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
		
		WebElement result = driver.findElementByXPath("(//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 sg-col'])[1]//h2//span");
		String text = result.getText();
		System.out.println(text);
		
//		5.  Get the Price of Speaker
		WebElement priceS = driver.findElementByXPath("(//span[@class='a-price'])[1]//span[@class='a-price-symbol']");
		String priceSymbol = priceS.getText();
		WebElement priceW = driver.findElementByXPath("(//span[@class='a-price'])[1]//span[@class='a-price-whole']");
		String priceWhole = priceW.getText();
		String priceAmount= priceSymbol+priceWhole;
		System.out.println(priceAmount);
		
//		6. Check Whether it is Free Delivery With Amazon
WebElement delivery = driver.findElementByXPath("((//div[@class='a-row a-size-base a-color-secondary s-align-children-center'])[1]//div[@class='a-row']//span)[2]");
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
