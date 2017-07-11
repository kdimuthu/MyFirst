package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollIntoView 
{
  @Test
  public void doVerticalScroll() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://mytutor.lk/");
	  
	// Create instance of Javascript executor
	  JavascriptExecutor je = (JavascriptExecutor) driver;
	//Identify the WebElement which will appear after scrolling down
	  WebElement element = driver.findElement(By.xpath("//form[@id='newsletter']/input[2]"));
	// now execute query which actually will scroll until that element is not appeared on page.
	  je.executeScript("arguments[0].scrollIntoView(true);",element);
	  System.out.println(element.getText());
	 
	 
  }
}
