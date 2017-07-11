package Screenshot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToApp {
WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
		public void openBrower() 
	{	
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");			
	}	
  @Test
  public void captureScreenshotLogin() throws Exception 
  {
	driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[2]/a/strong")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Dimramanayaka3@gmail.com");
	driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("dim123");
	driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys("dim123");
	driver.findElement(By.xpath("//input[@name='iagree']")).click();
	Select S1=new Select(driver.findElement(By.xpath("//select[@name='fk_title']")));
		S1.selectByIndex(0);
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("aaa");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("bbbbbbb");
	Select S2=new Select(driver.findElement(By.xpath("//select[@id='fk_gender']")));
		S2.selectByIndex(0);
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("0714955965");
	//driver.findElement(By.xpath("//input[@id='dob']")).click();
	//driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a")).click();
	driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("No 44, dddd, kkkk");
	
//	Utility.captureScreenshot(driver, "login1", null);  
	  
  }
  

@AfterTest
	public void CloserBrowser() 
{			  
		 driver.close();
}	  
}
