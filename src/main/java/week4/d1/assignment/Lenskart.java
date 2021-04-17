package week4.d1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lenskart {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.lenskart.com");
		WebElement cg = driver.findElementByLinkText("Computer Glasses");
		
		Actions act = new Actions(driver);
		act.moveToElement(cg).click().build().perform();
		//act.moveToElement(Men).click().build().perform();
		driver.findElementByXPath("//span[contains(text(),'PREMIUM RANGE')]").click();
		driver.findElementByXPath("//span[@title='Round']").click();
		Thread.sleep(3000);
		WebElement colour = driver.findElementByXPath("//li[@class='list-checkbox']//span[1]");
		colour.click();
		Thread.sleep(2000);
		String text = colour.getText();
		System.out.println(text);
		String count = text.replaceAll("[^\\d]", "");
		System.out.println(count);
		
		
		String count2 = driver.findElementByXPath("//div[@class='show_count']").getText();
		System.out.println("Count2:- "+count2);
		if (count2.contains(count)) 
		{
			System.out.println("Result Matched");
			
		} 
		else 
		{
			System.out.println("Result Not Matched");
		}
		WebElement amount = driver.findElementByXPath("//span[@class='text-color-black fw700']");
		
		act.moveToElement(amount).click().perform();
		WebElement size = driver.findElementByXPath("//p[text()='Size']//span[1]");
		System.out.println(size.getText());
		driver.close();
	}

}
