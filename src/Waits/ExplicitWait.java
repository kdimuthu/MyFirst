package Waits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait 
{
	
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
		public void openBrower() 
	{	
			driver.manage().window().maximize();
			driver.get("http://www.mytutor.lk/");			
	}		

	@Test
	public void createAccount() 
	{
	 	  
		driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[2]/a/strong")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Dimramanayaka4@gmail.com");
		driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("dim123");
		driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys("dim123");
		driver.findElement(By.xpath("//input[@name='iagree']")).click();
		Select S1=new Select(driver.findElement(By.xpath("//select[@name='fk_title']")));
			S1.selectByIndex(0);
			/*
			WebElement element= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='passwordNext']/content/span"))));
			element.click();;*/
			
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']"))).sendKeys("Explicit");
		
	//	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("aaa");
	//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("bbbbbbb");
		DoExplicitWait("//input[@id='lastname']");
		Select S2=new Select(driver.findElement(By.xpath("//select[@id='fk_gender']")));
			S2.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("0714955965");
			driver.findElement(By.xpath("//input[@id='dob']")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("No 44, dddd, kkkk");
		//This is how we can upload a file 
		WebElement fileInput=driver.findElement(By.name("file"));
		fileInput.sendKeys("C:\\Users\\dramachandra\\Desktop\\1.jpg");
		//driver.findElement(By.xpath("//input[@value='Register']")).click();
	}	  

	@AfterTest
		public void CloserBrowser() 
	{			  
			 driver.close();
	}	
	
	public void DoExplicitWait(String objectLocator)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.stalenessOf((WebElement) By.xpath(objectLocator)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectLocator))).sendKeys("LastName");;
	}

}
