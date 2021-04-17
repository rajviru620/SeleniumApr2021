package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	private static List<WebElement> data2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Set the system property and Launch the URL
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		
		
		
//clear the existing text from station text field

//type "ms"in the from station text field
		WebElement stationFrom = driver.findElementById("txtStationFrom");
		stationFrom.clear();
		stationFrom.sendKeys("ms",Keys.TAB);

		

//		tab in the from station text field
		
//		clear the existing text in the to station text field
		
//		type "mdu" in the to station text field
		WebElement stationTo = driver.findElementById("txtStationTo");
		stationTo.clear();
		stationTo.sendKeys("mdu",Keys.TAB);
		
		//Click the 'sort on date' checkbox
		driver.findElementById("chkSelectDateOnly").click();
		
		
//		Add a java sleep for 2 seconds
		Thread.sleep(2000);
		
//		Store all the train names in a list
		WebElement table2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		List<WebElement> row2 = table2.findElements(By.tagName("tr"));
		
		//int indexOf = row2.indexOf(driver.findElementsByTagName("td"));
		int rowCount = row2.size();
		System.out.println(rowCount);
		for (int i = 0; i < rowCount; i++) {
			List<WebElement> data = row2.get(i).findElements(By.tagName("td"));
			WebElement train = data.get(1);
			String trainName = train.getText();
			System.out.println(trainName);
			data.add(train);
		}

		
//				
		
		
		
		//		Get the size of list
		
//		Add the list into a new Set
		
//		Get the size of set

//		Compare the Size of list and Set to verify the names are unique

	}

}
