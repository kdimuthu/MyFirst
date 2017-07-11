package BaseClassExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseClass {
	

	@Test
	public void LogApp() 	{	
		
		driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
		driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout");		
	}	  	
}



