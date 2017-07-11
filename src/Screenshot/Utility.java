package Screenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{ 
  public static void captureScreenshot(WebDriver driver, String screenshotName,String folderLocaion) 
  {
	  try 
	  {
		  	TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);			
			//FileUtils.copyFile(src, new File("./Screenshot/Pass/"+screenshotName+"-"+timestamp()+".jpg"));	
			FileUtils.copyFile(src, new File(folderLocaion+screenshotName+"-"+timestamp()+".jpg"));
	  } catch (Exception e) 
	{
		System.out.println("Exception occured while taking screenshot" + e.getMessage());
	}	 
  }
  public static String timestamp() 
  {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
  
 
}
