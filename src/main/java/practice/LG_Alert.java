package practice;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Alert").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert3 = driver.switchTo().alert();
		String text3 = alert3.getText();
		System.out.println(text3);
		alert3.sendKeys("TestLeaf");
		alert3.accept();
		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		Alert alert4 = driver.switchTo().alert();
		String text4 = alert4.getText();
		System.out.println(text4);
		
		alert4.accept();
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		WebElement altext = driver.findElementByXPath("//div[@class='swal-text']");
		System.out.println(altext.getText());
		driver.findElementByXPath("//div[@class='swal-modal']//button").click();
		
		
		driver.close();
	}

}
