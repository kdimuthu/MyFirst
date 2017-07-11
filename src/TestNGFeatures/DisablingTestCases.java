package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisablingTestCases {
	
  @Test(enabled=false)
  public void testCase1() {
	  Assert.assertEquals("Msg", "Msg");
  }
  
  @Test
  public void testCase2() {
	  Assert.assertEquals("Msg1", "Msg1");
  }
  
  @Test
  public void testCase3() {
	  Assert.assertEquals("Msg2", "Msg2");
  }
}
