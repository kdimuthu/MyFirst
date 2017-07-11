package ParallelExecution;

import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ParallelExectuion3
{
	
	WebDriver driver=new FirefoxDriver();
	
	@Test
	public void createAccount() {
	driver.manage().window().maximize();
	driver.get("http://www.mytutor.lk/");	 	  
	driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[2]/a/strong")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Dimramanayaka4@gmail.com");
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
	File file = new File("/src/UploadingFiles/10.jpg");
	driver.findElement(By.name("file")).sendKeys(file.getAbsolutePath());
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	//driver.close();
}	  


}

