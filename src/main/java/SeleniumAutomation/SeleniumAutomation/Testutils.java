package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Testutils extends Basetest {
	
	public void takeScreenshot() throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;

		 File file=screenshot.getScreenshotAs(OutputType.FILE);

		 File destination=new File("F:\\Screenshots\\screenshots2.jpeg");

		 FileHandler.copy(file, destination);

	}

}
