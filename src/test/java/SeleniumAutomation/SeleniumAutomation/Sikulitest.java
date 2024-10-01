package SeleniumAutomation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
		String buttonImagePath = "C:\\Users\\c.JERVIN\\Documents\\Capture.PNG";
		try {
            // Find the button image on the screen
            Match buttonMatch = s.find(buttonImagePath);

            // Validate the presence of the button
            if (buttonMatch != null) {
                System.out.println("Button found!");
            } else {
                System.out.println("Button not found.");
            }
        } catch (FindFailed e) {
            // Handle FindFailed exception
            e.printStackTrace();
        }
		Pattern addfilepath = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Capture.PNG");
		Pattern cgotit = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Gotit.PNG");
		Pattern send = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Sen.PNG");
		Pattern open = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Open.PNG");
		Pattern val = new Pattern("C:\\Users\\c.JERVIN\\Documents\\ValndUp");
		s.click(cgotit);
		Thread.sleep(4000);
		s.click(addfilepath); 
			Thread.sleep(10000);
			
			s.type(send, "C:\\Users\\c.JERVIN\\Documents\\addfile.PNG");
			Thread.sleep(10000);
			s.click(open);
			Thread.sleep(10000);
			s.click(val);
//		s.wait(cancel, 20);
			
    } 

	
	@AfterMethod
    public void tearDown(ITestResult result) {
        if (driver != null) {
            // Check if test failed
            if (result.getStatus() == ITestResult.FAILURE) {
                System.out.println("Test failed. Closing the browser...");
            }
            // Close the browser regardless of test status
            driver.quit();
        }
	}
}
		

		
	
	
	
	


