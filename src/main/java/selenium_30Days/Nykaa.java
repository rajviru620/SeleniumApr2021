package selenium_30Days;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static Integer max;
	private static String text;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
		
		ChromeDriver driver = new  ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		1. Launch URL : "https://www.nykaa.com/"
		driver.get("https://www.nykaa.com");
		

//			2. Enter text as Perfumes in Search Bar and press Enter
		
			driver.findElementByXPath("//input[@name='search-suggestions-nykaa']").sendKeys("Perfumes",Keys.ENTER);
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("/Users/Rajaprabhakaran/eclipse-workspace/MavenProject/test.png"));
//			3. Get The Names Of all the Perfumes Displayed 
			
			List<WebElement> productList = driver.findElements(By.xpath("//div[@class='m-content__product-list__title']//span"));
			int size = productList.size();
			System.out.println("No of perfumes list:- "+size);
			
			System.out.println("List of perfumes name:- ");
			for (WebElement eachProduct : productList) {
				String productName = eachProduct.getText();
				System.out.println(productName);
			}
			
//			4. Get The Price of all the Perfumes Displayed
			List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='price-info']//span[@class='post-card__content-price-offer']"));
			int size2 = priceList.size();
			System.out.println("No of perfumes list:- "+size2);
			
			System.out.println("List of perfumes priceList:- ");
			for (WebElement eachPrice : priceList) 
			{
				String priceA = eachPrice.getText();
				String priceAm = priceA.replace("₹", "");
				int priceAmount = Integer.parseInt(priceAm);
				System.out.println(priceAmount);
				Set<Integer> hs = new HashSet<Integer>();
				hs.add(priceAmount);
				for (Integer element : hs) 
				{
					if(max == null)
					{
				        max = element;
				     //this will compare subsequent elements with max
				    }else if(max < element){
				        max = element;
				    }   	
				}
			     
			}
			System.out.println("Maximum price is: "+max);  
			String stringMax = max.toString();
//			5. Click on the Highest Price Perfume  
			for (int i = 0; i < size2; i++) {
				text = priceList.get(i).getText();
			if (text.contains(stringMax)) {
				priceList.get(i).click();
			}
			}
			Set<String> wh = driver.getWindowHandles();
			List<String> ll2 = new ArrayList<String>(wh);
			ll2.addAll(wh);
			driver.switchTo().window(ll2.get(1)); 	
			Thread.sleep(2000);			
//			6. Click on Add To Bag
			driver.findElementByXPath("//button[text()='ADD TO BAG'][1]").click();
			
//			7. verify Message Product Added To the bag 
			String verifyMessage = driver.findElementByXPath("//div[@class='add-to-bag-text']").getText();
			System.out.println(verifyMessage);

//			8. Click on bag Icon
			driver.findElementByXPath("//div[@class='AddBagIcon']").click();

//			9. Get the Grand Total Value
			String grandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
			System.out.println("Grand total is :- "+grandTotal);
			Thread.sleep(2000);
//			10. Click on Proceed
			
			driver.findElementByXPath("//span[text()='Proceed']//parent::button").click();
			
//			11. Click on Continue as Guest
			driver.findElementByXPath("//button[text()='CONTINUE AS GUEST']").click();
			
//			12. Fill all the Fields in Address 
			driver.findElementByXPath("//input[@name='name']").sendKeys("Test");
			driver.findElementByXPath("//input[@name='email']").sendKeys("Test123@test.com");
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9876543210");
			driver.findElementByXPath("//input[@name='pinCode']").sendKeys("600100");
			driver.findElementByXPath("//textarea[@class='textarea-control prl10']").sendKeys("Test Nagar");
			driver.findElementByXPath("//button[@type='submit']").click();
			Thread.sleep(2000);
//			13. Click on Paynow
			driver.findElementByXPath("//button[@type='submit']").click();
			
//			14. Get the Error Message dispalyed in Red Color
			String errorText = driver.findElementByXPath("//input[@name='cardNumber']//following::span[@class='field-error']").getText();
			System.out.println("Error Message is:- "+errorText);
			
//			15. close the current browser
		driver.close();
	}

}
