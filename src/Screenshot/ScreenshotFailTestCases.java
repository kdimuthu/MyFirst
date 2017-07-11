package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotFailTestCases  
{
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void openBrower() 
	{	
		driver.manage().window().maximize();
		driver.get("http://www.mytutor.lk/");			
	}
	
	@Test
	public void verifyTitle() 
	{   
	String Acutaltitle=driver.getTitle(); 
	String expectedtitle="Teachers Sri Lanka | Tuition Classes | Education in Sri Lanka";
	Assert.assertEquals(Acutaltitle, expectedtitle);
	}

	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		try
		{
			if(result.getStatus() == ITestResult.SUCCESS)
			{
				//Utility.captureScreenshot(driver, result.getName());
				Utility.captureScreenshot(driver, result.getName(), "./Screenshot/Pass/");
			}

			else if(result.getStatus() == ITestResult.FAILURE)
			{       	      
				Utility.captureScreenshot(driver, result.getName(), "./Screenshot/Fail/");
			}	
		}
   catch(Exception e)
   {
  	   System.out.println("Invalid status" + e.getMessage());
   }
    driver.close();
	}
}