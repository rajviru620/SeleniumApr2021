package week1.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/");
		driver.findElementByLinkText("HyperLink").click();
		driver.findElementByXPath("(//div[@class='example'])[1]//a").click();
		
		driver.findElementByLinkText("HyperLink").click();
		
		WebElement findLink = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		String attribute = findLink.getAttribute("href");
		System.out.println(attribute);
		
		WebElement brokenLink = driver.findElementByLinkText("Verify am I broken?");
		brokenLink.click();
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("It is a broken link");
		}
		else {
			System.out.println("Not a Broken Link");
		}
		driver.navigate().back();
		
		driver.findElementByXPath("(//div[@class='example'])[4]//a").click();
		
		driver.findElementByLinkText("HyperLink").click();
		
		List<WebElement> TagName = driver.findElementsByTagName("a");
		int linkCount = TagName.size();
		System.out.println(linkCount);
		
	}

}
