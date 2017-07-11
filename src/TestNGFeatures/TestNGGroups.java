package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGroups {
	
  @Test(priority=0, groups={"Smoke"})  
  public void testCase1() {
	  Assert.assertEquals("Msg", "Msg");
  }
  
  @Test(groups={"Smoke","Regression"})
  public void testCase2() {
	  Assert.assertEquals("Msg1", "Msg1");
  }
  
  @Test(groups={"Smoke","Regression","Funtional"})
  public void testCase3() {
	  Assert.assertEquals("Msg2", "Msg2");
  }
}
