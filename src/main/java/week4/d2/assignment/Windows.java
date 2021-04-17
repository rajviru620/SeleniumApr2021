package week4.d2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Window.html");
		
//		driver.findElementById("home").click();
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		List<String> ls1 = new ArrayList<String>(windowHandles1);
//		ls1.addAll(windowHandles1);
//		driver.switchTo().window(ls1.get(1));
//		String title1 = driver.getTitle();
//		System.out.println(title1);
//		driver.switchTo().window(ls1.get(0));
//		
//		
//		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
//		Set<String> windowHandles2 = driver.getWindowHandles();
//		List<String> ls2 = new ArrayList<String>(windowHandles2);
//		ls2.addAll(windowHandles2);
//		int size = ls2.size();
//		System.out.println(size);
//	
		
		driver.findElementByXPath("//button[@id='color' and text()='Do not close me ']").click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> ls3 = new ArrayList<String>(windowHandles3);
		ls3.addAll(windowHandles3);
		int size3 = ls3.size();
		System.out.println(size3);
		driver.switchTo().window(ls3.get(0));
		
		WebElement win4 = driver.findElementByXPath("//button[@id='color' and text()='Wait for 5 seconds']");
		win4.click();
		Thread.sleep(5000);
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> ls4 = new ArrayList<String>(windowHandles4);
		ls4.addAll(windowHandles4);
		int size4 = ls4.size();
		System.out.println(size4);
	
	
	}

}
