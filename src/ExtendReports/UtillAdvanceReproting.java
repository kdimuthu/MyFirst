package ExtendReports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtillAdvanceReproting 
{ 
  public static String captureScreenshot(WebDriver driver, String screenshotName,String folderLocation) 
  {
	  try 
	  {
		  	TakesScreenshot ts=(TakesScreenshot)driver;
			File srouce=ts.getScreenshotAs(OutputType.FILE);		 
			String dest=folderLocation+screenshotName+" "+timestamp()+".jpg";
			File destination=new File(dest);				
			FileUtils.copyFile(srouce, destination);
			System.out.println("screen shot captured");
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
