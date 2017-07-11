package UploadingFiles;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadingUsingRobot 
{	
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
		public void openBrower() 
	{	
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");				
	}		
	
	
	@Test(description="In this test, user will log to application be pressing enter key instead of clicking on login button")
	public void uploadFiles() throws Exception 
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
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("No 44, dddd, kkkk");
		   
		  // Specify the file location with extension
		StringSelection sel=new StringSelection("C:\\Users\\dramachandra\\workspace\\LearnAutomation\\src\\RobotClass\\Test.txt");

		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		// This will scroll down the page 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,350)");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.name("file")).click();
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
	
	}	  

	@AfterTest
		public void CloserBrowser() 
	{			  
		
			 //driver.close();
	}	
	
}
