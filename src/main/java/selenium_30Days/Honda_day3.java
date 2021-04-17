package selenium_30Days;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Honda_day3 
{
	
	public static String modelName;
	public static String priceAmount;
	public static String cityName;

	public static void main(String[] args) throws InterruptedException 
	{
		

	
	WebDriverManager.chromedriver().setup();

	ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");
	
	ChromeDriver driver = new  ChromeDriver(ops);

	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//1) Go to https://www.honda2wheelersindia.com/
		driver.get("https://www.honda2wheelersindia.com/");
	new WebDriverWait(driver, Duration.ofSeconds(100))
	.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='modal-dialog modal-lg']//button")));
	
	driver.findElementByXPath("//div[@class='modal-dialog modal-lg']//button").click();
	Thread.sleep(5000);
	//driver.findElementByXPath("//a[@id='link_Scooter']").click();
	//driver.findElementByLinkText("Scooter").click();
	driver.findElementByXPath("//a[text()='Scooter']").click();
	Thread.sleep(2000);
//		2) Click on scooters and click dio
		List<WebElement> scooters = driver.findElements(By.xpath("//div[@id='menu_Scooter']//div[@class='item']//img"));
		int size = scooters.size();
		for (int i = 0; i < size; i++) {
			String attribute = scooters.get(i).getAttribute("src");
			if (attribute.contains("dio")) {
			scooters.get(i).click();
			System.out.println("Matched - Dio scooter found");
			break;
			} 
		}
		String title = driver.getTitle();
		System.out.println(title);
		
		
//		3) Click on Specifications and mouseover on ENGINE
		
		driver.findElementByLinkText("Specifications").click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement engine = driver.findElementByXPath("//ul[@class='specifications']//a[text()='Engine']");
		act.moveToElement(engine).build().perform();
		
//		4) Get Displacement value
		
		String displacement = driver.findElementByXPath("//span[text()='Displacement']//following::span").getAttribute("innerHTML");
		System.out.println("Displacement of Dio Engine is:- "+displacement);
		Thread.sleep(3000);
		//		5) Go to Scooters and click Activa 125
		
		driver.findElementByXPath("//a[@id='link_Scooter' and text()='Scooter']").click();
		Thread.sleep(3000);
		List<WebElement> scooters1 = driver.findElements(By.xpath("//div[@id='menu_Scooter']//div[@class='item']//img"));
		int size1 = scooters1.size();
		System.out.println("********");
		for (int i = 0; i < size1; i++) {
			String attribute1 = scooters1.get(i).getAttribute("src");
			System.out.println(attribute1);
			driver.findElementByXPath("(//div[@class='owl-next'])[2]").click();
			Thread.sleep(1000);

			
					if (attribute1.contains("activa-125")) {
						
					
			scooters1.get(i).click();
			System.out.println("Matched - Activa125 scooter found");
			
					break;
			} 
		}
		String title1 = driver.getTitle();
		System.out.println(title1);
//		6) Click on Specifications and mouseover on ENGINE
		
		driver.findElementByLinkText("Specifications").click();
		
		WebElement engine1 = driver.findElementByXPath("//ul[@class='specifications']//a[text()='ENGINE']");
		act.moveToElement(engine1).build().perform();
		
		
//		7) Get Displacement value
		
		String displacement1 = driver.findElementByXPath("//span[text()='Displacement']//following::span").getAttribute("innerHTML");
		System.out.println("Displacement of Activa 125 Engine is:- "+displacement1);
		
//		8) Compare Displacement of Dio and Activa 125 and print the Scooter name having better Displacement.
		String[] split = displacement.split(" ");
		String dispValue= split[0];
	//	System.out.println("Split Value 1:- "+dispValue);
		
		double disp = Double.parseDouble(dispValue);
	//	System.out.println(disp);
		String[] split2 = displacement1.split(" ");
		String dispValue2= split2[0];
		double disp2 = Double.parseDouble(dispValue2);
		
		if (disp>disp2) {
			System.out.println("Dio Engine has a better displacement");
		} else {
			System.out.println("Activa 125 Engine has a better displacement");
		}
		
//		9) Click FAQ from Menu 
		driver.findElementByLinkText("FAQ").click();
		
//		10) Click Activa 125 BS-VI under Browse By Product
		driver.findElementByLinkText("Activa 125 BS-VI").click();
		
//		11) Click  Vehicle Price 
		driver.findElementByLinkText("Vehicle Price").click();
		
//		12) Make sure Activa 125 BS-VI selected and click submit
		String dd = driver.findElementByXPath("//select[@id='ModelID6']").getText();
		if(dd.contains("Activa 125 BS-VI")) {
			System.out.println("Confirmed "+dd);
			driver.findElementByXPath("//button[@id='submit6']").click();
		}
		
//		13) click the price link
		driver.findElementByXPath("//table[@id='tblPriceMasterFilters']//td//a[contains(text(),'Click here to know the price of')]").click();
		
		
//		14)  Go to the new Window and select the state as Tamil Nadu and  city as Chennai
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ll = new ArrayList<String>();
		ll.addAll(windowHandles);
		driver.switchTo().window(ll.get(1));
		WebElement stateID = driver.findElementById("StateID");
		Select sel1 = new Select(stateID);
		sel1.selectByVisibleText("Tamil Nadu");
		
		WebElement cityID = driver.findElementById("CityID");
		Select sel2 = new Select(cityID);
		sel2.selectByValue("1524");;
		
//		15) Click Search
		driver.findElementByXPath("//button[text()='Search']").click();
		
//		16) Print all the 3 models and their prices
		
		WebElement table = driver.findElementById("gvshow");
		String state = table.findElement(By.xpath("//table//th//label[@id='lblState']")).getText();
		System.out.println("Region:- "+state);
		
		List<WebElement> header = table.findElements(By.xpath("//tr[@class='headlbl']/th"));
		header.addAll(header);
		String city = header.get(0).getText();
		String model = header.get(1).getText();
		String exShowroomPrice = header.get(2).getText();
		List<WebElement> ll2 = table.findElements(By.xpath("//table[@id='gvshow']//tbody//tr"));
		int size2 = ll2.size();
		System.out.println(size2);
		Thread.sleep(2000);
		String r1 ="//table[@id='gvshow']//tbody//tr[";
		String r2 ="]//td[";
		String r3="]";
//		driver.findElements(By.xpath("//table[@id='gvshow']//tbody//tr));
			
		WebElement cityN = ll2.get(0).findElement(By.xpath("//td[1]"));
		cityName = cityN.getText();
		WebElement modelN1 = ll2.get(0).findElement(By.xpath("//td[2]"));
		String modelName1 = modelN1.getText();
		WebElement priceA1 = ll2.get(0).findElement(By.xpath("//td[3]"));	
		String priceAmount1 = priceA1.getText();
		System.out.println(city+" - "+cityName+" , "+model+" - "+modelName1+" , "+exShowroomPrice+ " - "+priceAmount1);
		
//		for (int i = 2; i <= size2; i++) {
//			WebElement modelN = driver.findElement(By.xpath(r1+i+r2+(i-1)+r3));
//			modelName = modelN.getText();
//			WebElement priceA = driver.findElement(By.xpath(r1+i+r2+(i)+r3));	
//			priceAmount = priceA.getText();
//			System.out.println(city+" - "+cityName+" , "+model+" - "+modelName+" , "+exShowroomPrice+ " - "+priceAmount);
//		}

		WebElement modelN2 = driver.findElement(By.xpath("//table[@id='gvshow']//tbody//tr[2]//td[1]"));
		String modelName2 = modelN2.getText();
		WebElement priceA2 = driver.findElement(By.xpath("//table[@id='gvshow']//tbody//tr[2]//td[2]"));	
		String priceAmount2 = priceA2.getText();
		System.out.println(city+" - "+cityName+" , "+model+" - "+modelName2+" , "+exShowroomPrice+ " - "+priceAmount2);
		
		WebElement modelN3 = driver.findElement(By.xpath("//table[@id='gvshow']//tbody//tr[3]//td[1]"));
		String modelName3 = modelN3.getText();
		WebElement priceA3 = driver.findElement(By.xpath("//table[@id='gvshow']//tbody//tr[3]//td[2]"));	
		String priceAmount3 = priceA3.getText();
		System.out.println(city+" - "+cityName+" , "+model+" - "+modelName3+" , "+exShowroomPrice+ " - "+priceAmount3);
		
		
			

		
//		17) Close all the Windows
	driver.close();
	
	}	
	

}
