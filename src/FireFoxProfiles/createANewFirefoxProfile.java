package FireFoxProfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class createANewFirefoxProfile
{
  @Test
  public void doVerticalScroll() 
  {	  
	  ProfilesIni profile = new ProfilesIni();
	  FirefoxProfile myprofile = profile.getProfile("SelenumTesting");
	  WebDriver driver = new FirefoxDriver(myprofile);	  
	  driver.manage().window().maximize();
	  driver.get("http://mytutor.lk/"); 
	 
  }
}
