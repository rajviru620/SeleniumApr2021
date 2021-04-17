package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CAirctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		
		driver.findElementByLinkText("FLIGHTS").click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> lsHandle = new ArrayList<String>(windowHandle);
		String window1 = lsHandle.get(1);
		driver.switchTo().window(window1);
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(lsHandle.get(0));
		driver.close();
		
		
		
	}

}
