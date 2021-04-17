package week4.d1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		WebElement table = driver.findElementById("table_id");
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> row = body.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println(rowCount);
		List<WebElement> column = row.get(0).findElements(By.tagName("th"));
		int columnCount = column.size();
		System.out.println(columnCount);
		for (int i = 1; i <rowCount; i++) 
		{
			List<WebElement> col1 = row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < columnCount; j++)
			{
				
			if (col1.get(j).getText().contains("Learn to interact with Elements")) 
				{
				String text2 = col1.get(j+1).getText();
				System.out.println("The Progress is :- "+text2);
				//col1.get(j+2).findElement(By.tagName("input")).click();
				break;
				}
			
			}
				
		}
		
	}
}
