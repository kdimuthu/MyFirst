package MultipleWindows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingMultipleBrowsers 
{
  @Test
  public void OpenNewBrowserTab() 
  {	
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.w3schools.com/html/default.asp");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//div[@id='main']/div[4]/a")).click();	
	  ArrayList<String> Parent_Window = new ArrayList<String> (driver.getWindowHandles());
	  ArrayList<String> Child_Window1 = new ArrayList<String> (driver.getWindowHandles());
	  ArrayList<String> Child_Window2 = new ArrayList<String> (driver.getWindowHandles());	  
	  driver.switchTo().window(Child_Window1.get(1));
	  driver.findElement(By.xpath("//a[@id='tryhome']")).click(); 	
	  driver.switchTo().window(Child_Window2.get(1));
	  driver.findElement(By.xpath("//a[@id='tryhome']")).click(); 	  
	 
  }
  
}
