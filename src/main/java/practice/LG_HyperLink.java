package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("HyperLink").click();
		
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement dest = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		String attribute = dest.getAttribute("href");
		System.out.println(attribute);
		
		driver.findElementByLinkText("Verify am I broken?").click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("404")) {
			System.out.println("It is broken link");
		} else {
			System.out.println("It is NOT broken link");
		}
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElementsByTagName("a");
		int count = links.size();
		System.out.println("Number of links in this page are: "+count);
		
		
		driver.close();
	}

}
