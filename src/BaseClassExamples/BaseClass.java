package BaseClassExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver=new FirefoxDriver();	
	
  @BeforeClass
  public void setUp() {	  
	  driver.manage().window().maximize();
	  driver.get("http://www.mytutor.lk/");
	  
  }
  
  @AfterClass
  public void closeBrowser() {	  
	  driver.close();	
  }
}
