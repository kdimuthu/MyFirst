package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerticalScrol 
{
  @Test
  public void doVerticalScroll() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://mytutor.lk/");
	// This  will scroll down page 1400 pixel vertical
	  ((JavascriptExecutor)driver).executeScript("scroll(0,1400)");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//form[@id='newsletter']/input[2]")).click();
	// This  will scroll down up the page again
	  ((JavascriptExecutor)driver).executeScript("scroll(0,-1400)"); 
	 
  }
}
