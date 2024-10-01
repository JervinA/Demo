package SeleniumAutomation.SeleniumAutomation;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basetest {
	
	static Logger log = Logger.getLogger(createLog.class);
	
	
	public static WebDriver driver=null;
	
	
	
	public static void launchBrowser()
	{
	/*	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();*/
		
		PropertyConfigurator.configure("C:\\Users\\c.JERVIN\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\log4j2.properties");
		
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		
		/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); */
	}

}
