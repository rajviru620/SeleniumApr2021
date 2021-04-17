package week1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
//		1. Load url "https://acme-test.uipath.com/login"
//		2. Enter email as "kumar.testleaf@gmail.com"
//		3. Enter Password as "leaf@12"
//		4. Click login button
//		5. Get the title of the page and print
//		6. Click on Log Out
//		7. Close the browser
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		
		
		
		
	}

}
