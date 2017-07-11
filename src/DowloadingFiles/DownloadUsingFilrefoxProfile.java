package DowloadingFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadUsingFilrefoxProfile {
	
	FirefoxProfile profile=new FirefoxProfile();
	
	@Test
	public void downloadfiles(){
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.colorado.edu/conflict/peace/download/");
		driver.findElement(By.xpath("//ol/li[1]/ol/li[1]/a")).click();
	}

	

}
