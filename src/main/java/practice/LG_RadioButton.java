package practice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Radio Button").click();
		
		driver.findElementByXPath("//input[@id='yes']").click();
		 WebElement unchecked = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]//input[1]");
		boolean uC = unchecked.isSelected();
		if (uC==true) {
			System.out.println("Unchecked option is the default selection");
		} else {
			System.out.println("Checked option is the default selection");
		}

		WebElement rb3 = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[3]//input[2]");
		boolean d = rb3.isSelected();
		if (d==true) {
			System.out.println("It is already selected");
		} else {
			
			rb3.click();
			System.out.println("It is selected now");
		}
		driver.close();
	}

}
