package PhantomJS;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadLessTestingUsingPhantomJS
{
  @Test
  public void testHeadless() 
  {
	 
	  File src=new File("lib/phantomjs1.exe");
	  System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
	  WebDriver driver=new PhantomJSDriver(); 
	  driver.manage().window().maximize();
	  driver.get("http://www.mytutor.lk/");
	  driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			 
	  driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("testUser1@gmail.com");			  
	  driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[2]/div/input")).sendKeys("dim123");
	  driver.findElement(By.xpath("//form[@id='form-reg']/div[2]/div[1]/input[2]")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).getText(), "Logout");
	  System.out.println("TEst");
	  
  }
}
