package ActionClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PerfomeMouseHover 
{
  @Test
  public void perfomeMouseHover() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://mytutor.lk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Actions actions =new Actions(driver);
	  WebElement mainMenu=driver.findElement(By.xpath("//nav[@id='main-navigation']/ul/li[2]/a/span[1]"));
	  WebElement SubMenu=driver.findElement(By.xpath("//nav[@id='main-navigation']/ul/li[2]/ul/li[2]/a"));
	  //Below is the first way
	  /*actions .moveToElement(mainMenu);
	  	
	  actions .moveToElement(SubMenu);
	  actions.click().build().perform();*/
	  
	  actions .moveToElement(mainMenu).moveToElement(SubMenu).click().build().perform();
  }
}
