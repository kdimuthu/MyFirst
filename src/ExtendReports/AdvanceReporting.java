package ExtendReports;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtendReports.UtillAdvanceReproting;


public class AdvanceReporting 
{	
	ExtentReports report=new ExtentReports("./report1.html");	
	ExtentTest logger;
	WebDriver driver=new FirefoxDriver();	

	 	
	@BeforeTest
		public void openBrower() 
	{		
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");	
			logger=report.startTest("Testing Tutor");
			//File file = new File("/src/extent-config.xml");
			report.loadConfig(new File("extent-config.xml"));
			report.loadConfig(ExtentReports.class, "extent-config.xml");
			report.loadConfig(ExtentReports.class, "ExtendReports", "extent-config.xml");	
			
	}

	@Test
	public void LogApp() 
	{		 	  
		driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
		logger.log(LogStatus.INFO, "Loging to Applicatin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
		driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout");			
		
	}	  
			

	@AfterMethod
	public void addScreenShottoExptedReport(ITestResult result)
	{
		try
		{
			if(result.getStatus() == ITestResult.SUCCESS)
			{
				logger.log(LogStatus.PASS, "test passed");
			}

			else if(result.getStatus() == ITestResult.FAILURE)
			{   			
				File file = new File("Screenshot/Fail/"+" ");				
				String imagePath=UtillAdvanceReproting.captureScreenshot(driver, result.getName(),file.getAbsolutePath());
				String image=logger.addScreenCapture(imagePath);				
				logger.log(LogStatus.FAIL, image);							
			}		
		}
   catch(Exception e)
   {
  	   System.out.println("Invalid status" + e.getMessage());
   }
		
	}
	@AfterTest
		public void CloserBrowser() 
	{	
			report.endTest(logger);
			report.flush();
			File file = new File("report1.html");
			driver.get(file.getAbsolutePath());
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			//driver.close();
	}	

}



