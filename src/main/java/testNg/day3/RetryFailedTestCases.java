package testNg.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases  implements IRetryAnalyzer {

	int maxretry =3;
	int retryCount =0;
	
	
	public boolean retry(ITestResult result) {
	
		if(!result.isSuccess() && retryCount<maxretry)
		{
			retryCount++;
			return true;
		}
			
			return false;
	}

}
