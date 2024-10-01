package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Testutils extends Basetest {
	
	public void takeScreenshot() throws IOException {
		
	/*	TakesScreenshot screenshot=(TakesScreenshot)driver;

		 File file=screenshot.getScreenshotAs(OutputType.FILE);

//		 File destination=new File("F:\\Screenshots\\screenshots2.jpeg");
		 
		 
		 
		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH mm ss").format(new Date());
		 
		 
		 
		 File destination=new File("F:\\Screenshots\\Letsshop\\screenshots2"  + timeStamp +".jpeg");
		 
//		 String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+"";

		 FileHandler.copy(file, destination);    */
		
		
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;

		 File file=screenshot.getScreenshotAs(OutputType.FILE);

//		 File destination=new File("F:\\Screenshots\\screenshots2.jpeg");
		 
		 
		 
		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date());
		 
		 String folderPath = "F:\\Screenshots\\" + timeStamp + "_LetsShop";
		 File directory = new File(folderPath);
		 directory.mkdir();
		 
		 
		 File destination=new File(folderPath + File.separator  + timeStamp + "LetsShop" + ".jpeg");
		 
//		 String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+"";

		 FileHandler.copy(file, destination);  
		
		

	}  

}
