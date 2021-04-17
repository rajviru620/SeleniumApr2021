package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CreateLead extends Baseclass {
	@BeforeClass
	public void setFileName() {
		excelFileName ="CreateLead";
	}
	@Test(dataProvider = "fetchData")
	public  void runCreateLead(String cName, String fName, String lName) {
	
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
}
//	@DataProvider(name="fetchData")
//	public String[][] sendData() throws IOException {
//		ReadExcel re = new ReadExcel();
//		String[][] data = re.readData();
//		return data;
//		
//		String[][] data = new String[2][3];
//		data[0][0] ="TestLeaf";
//		data[0][1] ="Hari";
//		data[0][2] ="R";
//		
//		data[1][0] ="TL";
//		data[1][1] ="Naveen";
//		data[1][2] ="E";
//		return data;
//		
//	}
	
}






