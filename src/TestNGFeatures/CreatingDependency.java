package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatingDependency {
	
  @Test(priority=0, groups={"Smoke"})  
  public void AddRecord() {
	  Assert.assertEquals("Msg", "Msg");
  }
  
  @Test(dependsOnMethods={"AddRecord"})
  public void UpdateRecord() {
	  Assert.assertEquals("Msg1", "Msg11");
  }
  
  @Test(dependsOnMethods={"UpdateRecord"})
  public void DeleteRecord() {
	  Assert.assertEquals("Msg2", "Msg2");
  }
}
