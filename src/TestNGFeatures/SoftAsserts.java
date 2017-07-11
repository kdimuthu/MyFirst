package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
	private SoftAssert softA = new SoftAssert();
	
  @Test(priority=0) 
  public void testCase1() {
	  Assert.assertEquals("Msg", "Msg");
	  System.out.println("Msg");
	  Assert.assertEquals("Msg1", "Msg1");
	  System.out.println("Msg1");
  }
  
  @Test(priority=1) 
  public void testCase2() {
	  Assert.assertEquals("Msg2", "Msg2");
	  System.out.println("Msg2");
	  Assert.assertEquals("Msg3", "Msg33");
	  System.out.println("Msg3");
	  Assert.assertEquals("Msg4", "Msg4");
	  System.out.println("Msg4");
  }
  
  @Test(priority=2) 
  public void testCase3() {
	  Assert.assertEquals("Msg5", "Msg5");
	  System.out.println("Msg5");
	  softA.assertEquals("Msg6", "Msg66");
	  System.out.println("Msg6");	  
	  softA.assertEquals("Msg7", "Msg7");
	  System.out.println("Msg7");	  
	  softA.assertAll();
  }
}
