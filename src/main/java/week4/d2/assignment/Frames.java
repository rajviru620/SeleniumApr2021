package week4.d2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id='Click']").click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		driver.findElementByXPath("//button[@id='Click1']").click();
		
		
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElementByXPath("//div[@id='wrapframe'][3]");
		Actions act = new Actions(driver);
		act.moveToElement(frame3).click().build().perform();
		List<WebElement> frameTag = driver.findElementsByTagName("iframe");
		int frameCount = frameTag.size();
		System.out.println(frameCount);
		driver.close();
		
		
		
		
		
		
	}

}
