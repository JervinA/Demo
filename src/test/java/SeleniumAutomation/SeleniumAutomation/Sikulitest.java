package SeleniumAutomation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikulitest extends Basetest {
	
	@Test
	
	public void execute() throws InterruptedException, FindFailed {
		
		launchBrowser();
		driver.get("https://uploadnow.io/en");
		Thread.sleep(10000);
//		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement addfile = driver.findElement(By.xpath("//button[text()=\"Add files\"]"));
//		addfile.click();
		Screen s= new Screen();
		
		Pattern addfilepath = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Capture.PNG");
		s.click(addfilepath); 
		Thread.sleep(5000);

		
	}
	
	
	

}
