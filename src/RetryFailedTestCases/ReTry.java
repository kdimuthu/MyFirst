package RetryFailedTestCases;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class ReTry implements IRetryAnalyzer {
	
	// set counter to 0
	int minretryCount=0;
	
	// set maxcounter value this will execute our test 3 times
	int maxretryCount=2;	

@Override
public boolean retry(ITestResult result) {
	
	// this will run until max count completes if test pass within this frame it will come out of for loop
	if(minretryCount<=maxretryCount){
		
		System.out.println("Following test is failing===="+result.getName());
		
		System.out.println("Retrying the test Count is=== "+ (minretryCount+1));
		
		//increment counter each time by 1  
		minretryCount++;

		return true;
	}
	return false;
}


}
