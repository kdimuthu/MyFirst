package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {		

		System. setProperty("webdriver.chrome.driver", "C:\\Seenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.mytutor.lk/");		
		driver.close();		
	}
}
