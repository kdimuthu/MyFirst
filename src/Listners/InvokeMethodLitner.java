package Listners;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class InvokeMethodLitner implements IInvokedMethodListener{
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
	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		if (method.isTestMethod() && ITestResult.SUCCESS == result.getStatus()) {
            
                System.out.println("test is passed");           
        }
    }
		
	

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		if (method.isTestMethod() && ITestResult.FAILURE == result.getStatus()) {
            Throwable throwable = result.getThrowable();
            String originalMessage = throwable.getMessage();
            
            try {
                System.out.println("error is"+" "+throwable+"=="+originalMessage);
                logger.error("failed"+"=="+originalMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
		
	}


