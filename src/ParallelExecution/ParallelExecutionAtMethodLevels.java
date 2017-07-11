package ParallelExecution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecutionAtMethodLevels
{	
	
		WebDriver driver=new FirefoxDriver();
		
		@Test
		public void verifyHomePageTitle() 
	{	
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");
			Assert.assertEquals(driver.getTitle(), "expected");
			//driver.close();
	}	
		
		@Test
			public void logingToApp() 
		{	
				driver.manage().window().maximize();
				driver.get("http://www.mytutor.lk/");				 	  
				driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
				driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
				driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
				driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
				Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout");			
				//driver.close();				 
		}	
		@Test
		public void verifyLoginPageTitle() 
	{	
				Assert.assertEquals(driver.getTitle(), "Logout");			
			//driver.close();				 
	}	
}
