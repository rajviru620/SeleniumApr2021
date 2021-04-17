package selenium_30Days;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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

public class Avis_day1 
{
	
	private static final SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws InterruptedException 
	{
		
//		1. Launch URL :https://www.avis.co.in/
	
	WebDriverManager.chromedriver().setup();

	ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");
	
	ChromeDriver driver = new  ChromeDriver(ops);

	
	//driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.avis.co.in/");

	
	
	
//		2. Select as Self Drive and  the City as Chennai 
	
		driver.findElementByXPath("//span[text()='Self Drive']").click();
		
		WebElement dd = driver.findElementByName("DrpCity");
		Select sel = new Select(dd);
		sel.selectByValue("6");
		
				
//		3. Enter Delivery Address
//		4. Select the Start date as todays date  
//		5. Select the time as current time in Start date
//		6.. Select the End Date as (+5) days from start date 
//		7. Select the time in End date
		Thread.sleep(5000);
		driver.findElementById("txtPickUp").sendKeys("Medavakkam",Keys.TAB);
		Thread.sleep(2000);
		
		 Date date = new Date();
	        Timestamp timestamp2 = new Timestamp(date.getTime());
	        System.out.println(timestamp2);
	        // 2021-03-24 16:34:26.666
	                                                            // number of milliseconds since January 1, 1970, 00:00:00 GMT
	     
	        
	       String dateValue = timestamp2.toString();
	       System.out.println(dateValue);
	       String[] split1= dateValue.split(" ");
	       String[] splitDate = split1[0].split("-");
	    
	       System.out.println(split1[0]);
	       String yearC =splitDate[0]; 
	       System.out.println(yearC);
	       
	       String monC =splitDate[1]; 
	       System.out.println(monC);
	       
	       String dateC1 =splitDate[2]; 
	       String dateC = dateC1.toString();
	       System.out.println(dateC);
	       
	       String[] splitTime = split1[1].split(":");
	       String hrC= splitTime[0];
	       String minC = splitTime[1];
	       int hrD = Integer.parseInt(hrC);
	       System.out.println(hrD);
	       
	       int minD = Integer.parseInt(minC);
	       System.out.println(minD);
	        
	       Thread.sleep(2000);
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("datetimepicker")));
		driver.findElementById("datetimepicker").click();
		Thread.sleep(2000);
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='xdsoft_datepicker active'])[6]")));
		
		WebElement monthValue = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[6]");
		String moV = monthValue.getText();
		System.out.println(moV);
		monthValue.click();
		
		WebElement mot = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[6]//following::div[text()='April']");
		mot.click();
		
		WebElement yearValue = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[6]");
		String yeV = yearValue.getText();
		System.out.println(yeV);
		yearValue.click();
		Thread.sleep(2000);
		String yeaT1 = "(//div[@class='xdsoft_label xdsoft_year'])[6]//following::div[text()='";
		String yeaT2="']";
		String yearFinal = yeaT1+yearC+yeaT2;
		//WebElement yOt = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[6]//following::div[text()='2022']");
		WebElement yOt = driver.findElementByXPath(yearFinal);
		yOt.click();
		
		Thread.sleep(2000);
		WebElement dayValue = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[6]");
		dayValue.click();
		Thread.sleep(2000);
//		String dayT1 = "(//div[@class='xdsoft_calendar'])[6]//table/tbody//td[@data-date='";
//		//Thread.sleep(2000);
//		String dateFinal = dayT1+dateC+yeaT2;
//		WebElement dOt = driver.findElementByXPath(dateFinal);
		//WebElement dOt = driver.findElementByXPath("(//td[@class='xdsoft_date xdsoft_day_of_week0 xdsoft_date xdsoft_current xdsoft_today xdsoft_weekend'])[4]");
		WebElement dOt = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[2]//table/tbody//tr//td[@data-date='2']");
		
		
		Thread.sleep(2000);
		dOt.click();
		
		
		
		
		
		

		//List<WebElement> timeElements = driver.findElements(By.xpath("(//div[@class='xdsoft_time_variant'])[2]//div[@class='xdsoft_time ' and @data-hour='9']"));
		//driver.findElementByXPath("(//div[@class='xdsoft_time_variant'])[2]//div[@class='xdsoft_time ' and @data-hour='9']")
//		String timeT1="(//div[@class='xdsoft_time_variant'])[2]//div[@class='xdsoft_time ' and @data-hour='";
//		String Fin1 ="[1]";
//		String Fin2 = "[2]";
//		String timeFinal1 = timeT1+hrC+yeaT2+Fin1;
//		String timeFinal2 = timeT1+hrC+yeaT2+Fin2;
//		System.out.println(timeFinal2);
//		int cutOff=30;
//		System.out.println(driver.findElementByXPath(timeFinal1));
//		if (minD>cutOff) {
//			driver.findElementByXPath(timeFinal2).click();
//		} else {
//			driver.findElementByXPath(timeFinal1).click();
//		}
//		
		//**********************************************
		//End date = Start Date + 5 days
		Calendar c = Calendar.getInstance();
	       c.add(Calendar.DAY_OF_MONTH, 5);
	       String newDate = sdf4.format(c.getTime());
	       System.out.println(newDate); 
	       
	       String dateValue1 = newDate.toString();
	       System.out.println(dateValue1);
	       String[] split3= dateValue1.split("-");
	       System.out.println(split3);
	    
	       
	       	    
	       System.out.println(split3[0]);
	       String yearH =split3[0]; 
	       String yearF = yearH.toString();
	       System.out.println(yearF);
	       
	       String monF =split3[1]; 
	       System.out.println(monF);
	       
	       String dateJ =split3[2]; 
	       String dateF = dateJ.toString();
	       System.out.println(dateF);
	       
	       new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("datetimepicker1")));
			driver.findElementById("datetimepicker1").click();
			Thread.sleep(2000);
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='xdsoft_datepicker active'])[5]")));
			
			WebElement monthValue2 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[5]");
			String moV2 = monthValue2.getText();
			System.out.println(moV2);
			monthValue2.click();
			Thread.sleep(2000);
			WebElement mot2 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[5]//following::div[text()='April']");
			mot2.click();
			Thread.sleep(2000);
//			WebElement yearValue2 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[5]");
//			String yeV2 = yearValue2.getText();
//			System.out.println(yeV2);
//			yearValue2.click();
//			Thread.sleep(2000);
//			String yeaX1 = "(//div[@class='xdsoft_label xdsoft_year'])//following::div[text()='";
		String yeaX2="']";
//			String yearXinal = yeaX1+yearF+yeaX2;
//			//WebElement yOt = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[6]//following::div[text()='2022']");
//			WebElement yOt2 = driver.findElementByXPath(yearXinal);
//			yOt2.click();
//			
//			Thread.sleep(2000);
			WebElement dayValue2 = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[5]");
			dayValue2.click();
			Thread.sleep(5000);
			String dayX1 = "(//div[@class='xdsoft_calendar'])[5]//table/tbody//tr//td[@data-date='";
			String dateF1 ="8";
			String dateXinal = dayX1+dateF1+yeaX2;
			WebElement dOt2 = driver.findElementByXPath(dateXinal);
			//WebElement dOt = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[6]//table/tbody//td[@data-date='25']");
			dOt2.click();
			Thread.sleep(2000);
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
//		8. Select the car of your choice in the Car List
		
		WebElement drp = driver.findElementById("drpCars");
		Select sel2 = new Select(drp);
		sel2.selectByVisibleText("Ertiga");
		
//		9. Click one the Search button
		
		driver.findElementByXPath("//input[@id='LnkSubmit']").click();
		
//		10. Get the car names and number of cars available
		
		List<WebElement> allCars = driver.findElementsByXPath("//div[@class='buttons']//preceding::h4");
		int size = allCars.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			String carNames = allCars.get(i).getText();
			System.out.println(carNames);
		}
//		11. Select car as Your choice and click on book
		
		List<WebElement> allList = driver.findElementsByXPath("//div[@class='buttons']//a");
		int count =0;
		for (int i = 0; i < size; i++) {
			boolean enabled = allList.get(i).isDisplayed();
			if (enabled==true) {
				
				allList.get(i).click();
				count ++;
				System.out.println("Available count: "+count);
			} 
		}
		Thread.sleep(2000);

//		Get the Car Information
		
		System.out.println("Car Information:- ");
		
		WebElement productInfo = driver.findElementByXPath("//div[@class='productInfo']//h1");
		String carName = productInfo.getText();
		System.out.println(carName);
		
		
		String basicRental = driver.findElementByXPath("//div[@class='productInfo']//p//span[1]").getText();
		System.out.println("Basic Rental:- "+basicRental);
		
		String Transmission = driver.findElementByXPath("//ul[@class='carfeature']//li[1]//span").getText();
		System.out.println("Transmission:- "+Transmission);
		
		String Doors = driver.findElementByXPath("//ul[@class='carfeature']//li[2]//span").getText();
		System.out.println("No. of Doors:- "+Doors);
		
		String SeatingCapacity = driver.findElementByXPath("//ul[@class='carfeature']//li[3]//span").getText();
		System.out.println("SeatingCapacity:- "+SeatingCapacity);
		
		String Luggage = driver.findElementByXPath("//ul[@class='carfeature']//li[4]//span").getText();
		System.out.println("Luggage:- "+Luggage);
		
		
//		12. Fill all the Fields available under Book as Guest(Quick Checkout)
		
		driver.findElementByXPath("//input[@placeholder='FIRST NAME']").sendKeys("test");
		driver.findElementByXPath("//input[@placeholder='LAST NAME']").sendKeys("Best");
		driver.findElementByXPath("//input[@placeholder='EMAIL']").sendKeys("testbest@test.com");
		driver.findElementByXPath("//input[@id='txtGMobileNo']").sendKeys("9876543210");
		driver.findElementByXPath("//input[@placeholder='Date Of Birth']").click();
		
//		new WebDriverWait(driver, Duration.ofSeconds(10))
//		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='xdsoft_datepicker active'])[5]")));
//		Thread.sleep(2000);
//		
//		WebElement monthValue3 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[5]");
//		String moV3 = monthValue3.getText();
//		System.out.println(moV3);
//		monthValue3.click();
//		
//		WebElement mot3 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_month'])[5]//following::div[text()='June']");
//		mot3.click();
//		Thread.sleep(2000);
//		WebElement yearValue3 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[5]");
//
//		yearValue3.click();
//		Thread.sleep(2000);
//		WebElement yOt3 = driver.findElementByXPath("(//div[@class='xdsoft_label xdsoft_year'])[5]//following::div[text()='1984']");
//		
//		yOt3.click();
//		
//		
//		WebElement dayValue3 = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[5]");
//		dayValue3.click();
//		
//		WebElement dOt3 = driver.findElementByXPath("(//div[@class='xdsoft_calendar'])[5]//table/tbody//tr//td[@data-date='6']");
//		
//		Thread.sleep(2000);
//		dOt3.click();
//		dOt3.click();
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.TAB).build().perform();
//		
//		Thread.sleep(3000);
//		
		driver.findElementByXPath("(//input[@type='submit' and @value='Submit'])[5]").click();
		
//		 13. Fill all the Fields available under Other Details except co-driver Field.
//		14.Enter dummy Aadhar Number 
//		15. Click on I agree to terms and conditions
		
		driver.findElementByXPath("//input[@placeholder='Aadhaar Card number']").sendKeys("987654321098");
		driver.findElementByXPath("//input[@class='checkbox-custom'][1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@type='checkbox'])[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='modal-content']//div[2]").click();
		
//		16. Get the Total Amount under New Booking Details
		String totalAmount = driver.findElementByXPath("(//div[@class='basic-summary']//li)[7]//span").getText();
		System.out.println("Total amount:- "+totalAmount);
		
//		17. Verify the Colour of Confirm Booking.
		
		WebElement cnf = driver.findElementByXPath("//a[text()='Confirm Booking']");
		String color = cnf.getCssValue("background-color");
		System.out.println(color);
		
		
	}	
	

}
