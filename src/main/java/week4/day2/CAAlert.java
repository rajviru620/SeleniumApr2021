package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CAAlert {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Raja");
		alert.accept();
	WebElement	freetext = driver.findElementByXPath("//p[@id='demo']");
	String text = freetext.getText();
	System.out.println(text);
	if (text.contains("Raja")) {
		System.out.println("Verified successfully");
	}
	else {
		System.out.println("Not Matched");
	}
	}

}
