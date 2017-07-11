package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecution2
{		
	WebDriver driver=new FirefoxDriver();
		
		@Test
			public void openBrower() 
		{	
				driver.manage().window().maximize();
				driver.get("http://www.mytutor.lk/");
				Assert.assertEquals(driver.getTitle(), "expected");
				//driver.close();
		}	
}
