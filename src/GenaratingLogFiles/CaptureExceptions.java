/*package GenaratingLogFiles;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureExceptions 
{	
		Logger logger=LogManager.getLogger("Testing");
		
				
		WebDriver driver=new FirefoxDriver();
		
		@BeforeTest
			public void openBrower(){	
				driver.manage().window().maximize();
				driver.get("http://www.mytutor.lk/");	
				logger.info("Browser Opened");
				}		

		@Test
		public void LogApp(){
			
			driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
			driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
			driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
			driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
			try{
				Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout1");
			
				}catch(Exception exp)
			{
					logger.info("Login success" +exp);
					logger.debug("D is"+exp);
					logger.error("E is"+exp);
					logger.fatal("F is"+exp);
					System.out.println("testP");
					Assert.fail();
		} }

		@AfterTest
			public void CloserBrowser() 
		{			  
				 driver.close();
		}	

}
*/