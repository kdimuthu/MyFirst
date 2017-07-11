package Listners;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverListner
{	
		Logger logger=Logger.getLogger("Testing");
		
				
		WebDriver driver=new FirefoxDriver();
		EventFiringWebDriver event1=new EventFiringWebDriver(driver);
		ActivityCapture objActivityCapture=new ActivityCapture();

		@Test
			public void openBrower() 
		{	
			try{
			event1.register(objActivityCapture);
			event1.navigate().to("http://www.mytutor.lk/");
			event1.manage().window().maximize();				
			logger.info("Browser Opened");					 	  
			event1.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
			event1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
			event1.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
			event1.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
			event1.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout1");
			logger.info("Login success");
			event1.unregister(objActivityCapture);
		}
		catch(Exception e){
			System.out.println("error occured"+e);}
		}

		@AfterTest
			public void CloserBrowser() 
		{			  
				// driver.close();
		}	

}
