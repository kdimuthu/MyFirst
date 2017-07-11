package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{	
	WebDriver driver;
		
		
			@Test
			@Parameters("browser")
			public void loginTBrowseroApp(String BrowserName){	
				if(BrowserName.equalsIgnoreCase("FireFox")){
					driver=new FirefoxDriver();
				}
				else if(BrowserName.equalsIgnoreCase("Chrome")){
				System. setProperty("webdriver.chrome.driver", "C:\\Seenium\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				}
				else if(BrowserName.equalsIgnoreCase("IE")){
					System. setProperty("webdriver.ie.driver", "C:\\Seenium\\drivers\\IEDriverServer64.exe");
					driver=new InternetExplorerDriver();
				}
					
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
}
