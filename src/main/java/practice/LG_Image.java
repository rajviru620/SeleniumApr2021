package practice;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Image").click();
		
		WebElement img1 = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[1]//img");
		String attribute = img1.getAttribute("src");
		System.out.println(attribute);
		img1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement broken = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]//img");
		String attribute2 = broken.getAttribute("src");
		System.out.println(attribute2);
		
		driver.navigate().to(attribute2);
		String title = driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("It is a Broken image");
		} else {
			System.out.println("It is a valid image");
		}
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.close();
	}

}
