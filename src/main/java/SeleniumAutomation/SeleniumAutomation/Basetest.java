package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	
	public static WebDriver driver=null;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}

}
