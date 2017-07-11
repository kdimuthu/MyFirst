package RobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyBoardEvents 
{	
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
		public void openBrower() 
	{	
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");				
	}		
	
	
	@Test(description="In this test, user will log to application be pressing enter key instead of clicking on login button")
	public void LogAppbyPressingEnterKey() throws Exception 
	{		 	  
		driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
		//driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout");		
	}	  

	@AfterTest
		public void CloserBrowser() 
	{			  
			 driver.close();
	}	
	
}
