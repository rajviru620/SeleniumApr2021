package week1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Button").click();
		driver.findElementById("home").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Button").click();
		
		WebElement position = driver.findElementById("position");
		Point location = position.getLocation();
		int x = location.getX();
		System.out.println("X value is:");
		System.out.println(x);
		
		int y = location.getY();
		System.out.println("Y value is:");
		System.out.println(y);
		
		WebElement background = driver.findElementById("color");
		String attribute = background.getAttribute("style");
		System.out.println(attribute);
		
		
		WebElement dim = driver.findElementById("size");
		Dimension dime= dim.getSize();
		int height = dime.getHeight();
		System.out.println("Height is:");
		System.out.println(height);
		System.out.println("Width is:");
		int width = dime.getWidth();
		System.out.println(width);
		
		
		
		
	}

}
