package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Button").click();
		
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement posElement = driver.findElementByXPath("//button[@id='position']");
		Point location = posElement.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("The position of X and Y are: "+x +"and "+y);
		
		WebElement colElement = driver.findElementByXPath("//button[@id='color']");
		String attribute = colElement.getAttribute("style");
		System.out.println(attribute);
		
		WebElement sizeElement = driver.findElementByXPath("//button[@id='size']");
		Dimension size = sizeElement.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("The height and width of the element are "+height+" and "+width);
		
		driver.close();
	}

}
