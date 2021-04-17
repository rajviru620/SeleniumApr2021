package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static RemoteWebDriver driver;
	public String excelFileName;
	@Parameters({"browserName","username","password","url"})
	@BeforeClass
	public void preCondition(String browserName, String username, String password, String url) {
		// TODO Auto-generated method stub
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new  ChromeDriver();
				}
				else if(browserName.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new  EdgeDriver();
						}
				
				else if(browserName.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new  FirefoxDriver();
						}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData", parallel =true)
	public  String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		String[][] data = re.readData(excelFileName);
		return data;
	}
}
