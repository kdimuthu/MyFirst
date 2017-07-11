package BrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) {
		System. setProperty("webdriver.ie.driver", "C:\\Seenium\\drivers\\IEDriverServer64.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.mytutor.lk/");
		driver.findElement(By.xpath("//div[@id='top-header']/div/nav[2]/ul/li[1]/a/strong")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='form-reg']/div[1]/div[1]/div/input")).sendKeys("test@gmail.com");
		driver.close();
	}

}
