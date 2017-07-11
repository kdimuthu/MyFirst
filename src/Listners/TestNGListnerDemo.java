package Listners;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListnerDemo implements ITestListener {
	
	Logger logger=Logger.getLogger(this.getClass().getSimpleName());
	
@Test
  public void testCase1() {
	  Assert.assertEquals("Msg", "Msg");
  }
  
  @Test
  public void testCase2() {
	  Assert.assertEquals("Msg1", "Msg11");
  }
  
  @Test
  public void testCase3() {
	  Assert.assertEquals("Msg2", "Msg2");
  }

@Override
public void onTestStart(ITestResult result) {
	
	
}

@Override
public void onTestSuccess(ITestResult result) {
	
	System.out.println("Congrates Testcase has been passed===="+ result.toString());
	logger.info("Test Case Passed"+ result.getTestName());
}

@Override
public void onTestFailure(ITestResult result) {
	
	System.out.println("Screen shot captured====="+result.toString());
	logger.info("Test Case Failed"+ result.getTestName()+result.getStatus());
}

@Override
public void onTestSkipped(ITestResult result) {
	
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}

@Override
public void onStart(ITestContext context) {
	
	System.out.println("TestCase started====" +context.toString());
	logger.info("Test Case Passed"+ context.getName());
		
}

@Override
public void onFinish(ITestContext context) {
	
	
}
}
