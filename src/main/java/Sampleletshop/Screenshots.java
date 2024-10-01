package Sampleletshop;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Screenshots extends Basetest {
	
public void takeScreenshot() throws IOException {
		
		TakesScreenshot picture=(TakesScreenshot)driver;

		 File file=picture.getScreenshotAs(OutputType.FILE);

		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH mm ss").format(new Date());
		 
		 File destination=new File("F:\\Screenshots\\Sampleletshop\\screenshots"  + timeStamp +".jpeg");
		 
		 FileHandler.copy(file, destination);

	}

}
