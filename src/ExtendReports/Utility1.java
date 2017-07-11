package ExtendReports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility1 
{ 
  public static String captureScreenshot(WebDriver driver, String screenshotName,String folderLocaion) 
  {
	  try 
	  {
		  	TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);		 
			String dest=folderLocaion+screenshotName+"-"+timestamp()+".jpg";
			File destination=new File(dest);				
			FileUtils.copyFile(src, destination);
			
			return dest;			
	  } catch (Exception e) 
	{
		System.out.println("Exception occured while taking screenshot" + e.getMessage());
		return e.getMessage();
	}
	
		 
  }
  public static String timestamp() 
  {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}
