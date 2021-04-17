package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Drop down").click();
		
		WebElement qIndex= driver.findElementById("dropdown1");
		Select dd1 = new Select(qIndex);
		dd1.selectByIndex(1);
		
		
		WebElement qText= driver.findElementByName("dropdown2");
		Select dd2 = new Select(qText);
		dd2.selectByVisibleText("Appium");
		
		
		WebElement qValue= driver.findElementById("dropdown3");
		Select dd3 = new Select(qValue);
		dd3.selectByVisibleText("UFT/QTP");
		
		WebElement qCount= driver.findElementByClassName("dropdown");
		Select dd4 = new Select(qCount);
		List<WebElement> options = dd4.getOptions();
		int count = options.size() -1;
		System.out.println(count);
		
		
		
		
	}

}
