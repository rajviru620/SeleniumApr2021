package selenium_30Days;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket_day3 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		1) Go to https://www.bigbasket.com/
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
		
		ChromeDriver driver = new  ChromeDriver(ops);

		
		//driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");

		
//			2) mouse over on  Shop by Category 
		Actions act = new Actions(driver);
		WebElement spgtg = driver.findElementByXPath("//li[@class='dropdown full-wid hvr-drop']");
		act.moveToElement(spgtg).build().perform();
		
		
//			3)Go to FOODGRAINS, OIL & MASALA --> RICE & RICE PRODUCTS 
		
			WebElement fom = driver.findElementByLinkText("Foodgrains, Oil & Masala");
			act.moveToElement(fom).build().perform();
			Thread.sleep(2000);
			WebElement rrp = driver.findElementByLinkText("Rice & Rice Products");
			act.moveToElement(rrp).build().perform();
//			4) Click on Boiled & Steam Rice
			
			WebElement bsr = driver.findElementByLinkText("Boiled & Steam Rice");
			act.moveToElement(bsr).click().build().perform();
			
//			5) Choose the Brand as bb Royal
			driver.findElementByXPath("//span[text()='bb Royal']//parent::label//i").click(); 
			Thread.sleep(2000);
//			6) Go to Ponni Boiled Rice - Super Premium and select 5kg bag from Dropdown
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']")));
			
			WebElement Psp = driver.findElementByXPath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']");
			act.moveToElement(Psp).build().perform();
			
			driver.findElementByXPath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']//following::button[1]").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']//following::ul//li//a//span[text()='5 kg']").click();
			//driver.findElementByXPath("//a[text()='Ponni Boiled Rice']//following::ul//li[4]").click();
			
//			7) print the price of Rice
			
		String	price = driver.findElementByXPath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']//following::span[@class='discnt-price'][1]//span").getText();
			System.out.println("Rs."+price);
			
//			8) Click Add button
			
			driver.findElementByXPath("//a[text()='Ponni Boiled Rice/Kusubalakki - Super Premium']//following::button[@qa='add']").click();
			Thread.sleep(2000);
			driver.navigate().refresh();
//			9) Verify the success message displayed
//		String text = driver.findElementByXPath("//div[contains(text()='Successfully added Rice')]").getText();
//			System.out.println(text);
			driver.navigate().refresh();
			
			
//			10) Type Dal in Search field and enter
			driver.findElementByXPath("//input[@qa='searchBar']").sendKeys("Dal",Keys.ENTER);
			
			
//			12) Go to Toor/Arhar Dal and select 2kg & set Qty 2 
			
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Toor/Arhar Dal']")));
			
			WebElement tad = driver.findElementByXPath("//a[text()='Toor/Arhar Dal']");
			act.moveToElement(tad).build().perform();
			
			driver.findElementByXPath("//a[text()='Toor/Arhar Dal']//following::button[1]").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//a[text()='Toor/Arhar Dal']//following::button[1]//following::ul//li//a//span[text()='2 kg']").click();
			
			WebElement qty = driver.findElementByXPath("//a[text()='Toor/Arhar Dal']//following::div[@qa='qty']//input");
			qty.clear();
			qty.sendKeys("2");
			Thread.sleep(2000);
			
//			13) Print the price of Dal
			
			String	dalprice = driver.findElementByXPath("//a[text()='Toor/Arhar Dal']//following::span[@class='discnt-price'][1]//span").getText();
			System.out.println("Rs."+dalprice);
			
//			14) Click Add button
			
			driver.findElementByXPath("//a[text()='Toor/Arhar Dal']//following::button[@qa='add']").click();
						
			Thread.sleep(1000);
			String text = driver.findElementByXPath("//div[@class='toast-title']").getText();
			System.out.println(text);
			driver.findElementByXPath("//div[@class='toast-title']//parent::div//button").click();
			Thread.sleep(5000);
//			15) Mouse hover on My Basket 
			WebElement basket = driver.findElementByXPath("//span[@class='basket-content']");
			act.moveToElement(basket).build().perform();
//			16) Validate the Sub Total displayed for the selected items
			String subTotal = driver.findElement(By.xpath("//span[@ng-bind='vm.cart.cart_total']")).getAttribute("innerHTML");
			System.out.println("SubTotal:- Rs."+subTotal);
			
//			17) Reduce the Quantity of Dal as 1 
			driver.findElementByXPath("(//button[@qa='decQtyMB'])[2]").click();
			Thread.sleep(1000);
			
//			18) Validate the Sub Total for the current items
			String subTotal2 = driver.findElement(By.xpath("//span[@ng-bind='vm.cart.cart_total']")).getAttribute("innerHTML");
			System.out.println("Final SubTotal:- Rs."+subTotal2);
			
//			19) Close the Browser
			driver.quit();
	}

}
