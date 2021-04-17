package practice;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Checkbox").click();
		
		List<WebElement> lang1 = driver.findElementsByXPath("(//div[@class='example'])[1]//div");
		int size = lang1.size();
		System.out.println(size);
		Thread.sleep(2000);
		for (int i = 0; i < size; i++) {
			String text = lang1.get(i).getText();
			
			if (text.contains("Java")) {
				lang1.get(i).findElement(By.tagName("input")).click();
				System.out.println("Java Selected");
			} else if (text.contains("SQL")) {
				lang1.get(i).findElement(By.tagName("input")).click();
				System.out.println("SQL Selected");
			}else 
			{
				System.out.println("Not ur option "+text);
			}
		}
		
		WebElement check = driver.findElementByXPath("(//div[@class='example'])[2]//input");
		boolean selected = check.isSelected();
		if (selected==true) {
			System.out.println("Already selected");
		} else {
			System.out.println("Not selected");
		}
		
		List<WebElement> checkList = driver.findElementsByXPath("(//div[@class='example'])[3]//input");
		int size2 = checkList.size();
		System.out.println(size2);
		
		for (int i = 0; i < size2; i++) {
			boolean selected2 = checkList.get(i).isSelected();
			if (selected2==true) {
				checkList.get(i).click();
				System.out.println("Deselected");
			}
		}
		
		List<WebElement> opt = driver.findElementsByXPath("(//div[@class='example'])[4]//input");
		int size3 = opt.size();
		System.out.println(size3);
		
		for (WebElement eachOptions : opt) {
			eachOptions.click();
		}
		driver.close();
	}

}
