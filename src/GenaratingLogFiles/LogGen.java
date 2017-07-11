/*package GenaratingLogFiles;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LogGen {

	public class logs {
		@Test
		public void loggenaratge(){
		//Logger logger=LogManager.getLogger("Testing");		
		 
		 WebDriver driver=new FirefoxDriver();
		 Logger LoggerParent = Logger.getLogger("Test");
	     try
	     {
	    	 driver.manage().window().maximize();
				driver.get("http://www.mytutor.lk/");	
				LoggerParent.info("Browser Opened");
				driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
				//driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
				//driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
				//driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
				Assert.assertEquals(driver.getTitle(), "Logout1");
	     }
	     catch(Exception exp)
	     {
	       LoggerParent.error("Following exception was raised", exp);	
	       Assert.fail();
	    //  LoggerParent.error("message", exp);
	     }     }}}*/