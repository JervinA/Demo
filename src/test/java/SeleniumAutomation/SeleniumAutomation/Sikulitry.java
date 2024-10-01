package SeleniumAutomation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulitry  {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  */
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();  
		driver.get("https://uploadnow.io/en");
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,100)","" );
//		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement addfile = driver.findElement(By.xpath("//button[text()=\"Add files\"]"));
//		addfile.click();
		Screen s= new Screen();
		
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
//	s.wait(cancel, 20);
	//	s.mouseDown(10);
		
//	s.click(cancel);
		
		
		
		 
		

	}

}
