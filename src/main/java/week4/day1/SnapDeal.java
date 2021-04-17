package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		WebElement linkMen = driver.findElementByLinkText("Men's Fashion");
		
		Actions act = new Actions(driver);
		act.moveToElement(linkMen).perform();;
		Thread.sleep(2000);
		WebElement Jacket = driver.findElementByLinkText("Jackets");
		act.moveToElement(Jacket).click().build().perform();
		
		Thread.sleep(2000);
		
		WebElement hoverImage = driver.findElementByXPath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '][1]//div[@class='product-tuple-image ']");
		act.moveToElement(hoverImage).perform();
		
		WebElement quickView = driver.findElementByXPath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '][1]//div[@class='product-tuple-image ']//div[@class='clearfix row-disc']//div");
		act.moveToElement(quickView).click().build().perform();
		WebElement price = driver.findElementByXPath("//div[@class='product-price pdp-e-i-PAY-l clearfix']//span");
		String priceText = price.getText();
		System.out.println("The price for the Jacket is: Rs."+priceText);
		driver.quit();
	}

}
