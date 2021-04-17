package selenium_30Days;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {
	public static String carName;
	public static String carPrice;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		1) Go to https://www.carwale.com/
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
		
		ChromeDriver driver = new  ChromeDriver(ops);

		
		//driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Continue in English']")));
		driver.findElementByXPath("//div[text()='Continue in English']").click();
		
//			2) Click on Used
		driver.findElementByXPath("//div[@data-unique-key='new']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@data-unique-key='used']").click();
		
//			3) Select the City as Chennai
			WebElement city = driver.findElementByXPath("(//input[@type='text'])[2]");
			city.click();
			city.clear();
			city.sendKeys("Chennai",Keys.DOWN);
			Thread.sleep(2000);
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@data-label='Chennai, Tamil Nadu']")));
			Actions act = new Actions(driver);
			WebElement dd = driver.findElementByXPath("//li[@data-label='Chennai, Tamil Nadu']//div[1]");
			Thread.sleep(2000);
			act.moveToElement(dd).build().perform();
			
			dd.click();
//			4) Select budget min (8L) and max(12L) and Click Search
			
			driver.findElementByXPath("//input[@placeholder='Min']").sendKeys("8");
			driver.findElementByXPath("//input[@placeholder='Max']").sendKeys("12");
			driver.findElementByXPath("//button[text()='Search']").click();
			
//			5) Select Cars with Photos under Only Show Cars With
			WebElement cP = driver.findElementByXPath("//li[@name='CarsWithPhotos']");
			cP.click();
//			new WebDriverWait(driver, Duration.ofSeconds(30))
//			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='nomoreTips cur-pointer']")));
			
			driver.findElementByXPath("//a[@class='nomoreTips cur-pointer']").click();
			
			WebElement top = driver.findElementByXPath("//div[@class='filter-set margin-top20']");
			act.moveToElement(top).build().perform();
			Thread.sleep(1000);
			
//			6) Select Manufacturer as "Hyundai" --> Creta
			driver.findElementByXPath("//input[@placeholder='Select Manufacturer']").sendKeys("Hyundai");
		WebElement carElement = driver.findElementByXPath("//ul[@id='makesList']//li[@data-manufacture-en='Hyundai']");
//			Coordinates coordinate = ((Locatable)carElement).getCoordinates();
//			coordinate.inViewPort();
//			
//			Thread.sleep(1000);
			
			carElement.click();
			//act.moveToElement(carElement).click().build().perform();
			
			driver.findElementByXPath("//li[@data-manufacture-en='Hyundai']//following::span[text()='Creta']").click();
			Thread.sleep(1000);
//			7) Select Fuel Type as Petrol
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			driver.findElementByXPath("//div[@name='fuel']//h3").click();
			driver.findElementByXPath("//div[@name='fuel']//following::span[text()='Petrol']").click();
			
//			8) Select Best Match as "KM: Low to High"
			
			WebElement sort = driver.findElementById("sort");
			Select sel = new Select(sort);
			sel.selectByValue("2");
					
			
//			9) Validate the Cars are listed with KMs Low to High
			List<WebElement> ll = driver.findElements(By.xpath("//span[@data-carname-id='carname']"));
			int size = ll.size();
			System.out.println(size);
			
					
				List<WebElement> cPr = driver.findElementsByXPath("//span[@data-carname-id='carname']//following::td//span[@class='slkms vehicle-data__item']");
				int size2 = cPr.size();
					for (int i = 0; i < size2; i++) {
					 carName = ll.get(i).getText();
					carPrice = cPr.get(i).getText();
					System.out.println(carName+" - "+carPrice);
					
					
				}
					
							
			
			
//			10) Add the least KM ran car to Wishlist
	driver.findElementByXPath("//span[@class='shortlist-icon--inactive shortlist']").click();
	
//			11) Go to Wishlist and Click on More Details
	driver.findElementByXPath("//li[@class='action-box shortlistBtn']").click();
	Thread.sleep(1000);
	driver.findElementByLinkText("More details »").click();
	
		Set<String> wh = driver.getWindowHandles();
		List<String> ll2 = new ArrayList<String>(wh);
		ll2.addAll(wh);
		driver.switchTo().window(ll2.get(1)); 	
		Thread.sleep(3000);
		driver.findElementByLinkText("Got it").click();
	
//			12) Print all the details under Overview in the Same way as displayed in application
			WebElement ow = driver.findElementByXPath("//div[@id='overview']");
			act.moveToElement(ow).build().perform();
			List<WebElement> overview = driver.findElements(By.xpath("//div[@class='overview-list padding-bottom10']//ul//li"));
			
			int size3 = overview.size();
			String x1 ="//div[@class='overview-list padding-bottom10']//ul//li[";
			String x2 ="]//div[1]";
			String x3 ="]//div[2]";
			
			String text = driver.findElementByXPath("//div[@class='overview-list padding-bottom10']//ul//li[1]//div[1]").getText();
			System.out.println(text);
			
			for (int i = 1; i <= size3; i++) {
				//String attribute = driver.findElement(By.xpath("//div[@id='overview']//li["+i+"]//div[1]")).getText();
					String attribute = driver.findElementByXPath(x1+i+x2).getText();
					
					//for (int j = 0; j < size3; j++) {
						//String value = overview.get(i).findElement(By.xpath("//div[2]")).getText();
						String value = driver.findElementByXPath(x1+i+x3).getText();
						System.out.println(attribute+" - "+value);
					
					
					
			}
		
//			13) Close the browser.
		               
			driver.close();
	}
}
