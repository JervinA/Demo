package SeleniumAutomation.SeleniumAutomation;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class createLog {
	
	static Logger log = Logger.getLogger(createLog.class);
	public static void main(String[] args) {
	PropertyConfigurator.configure("C:\\Users\\c.JERVIN\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\log4j2.properties");
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
	
	WebDriver driver = new EdgeDriver();
//	WebDriver driver = new ChromeDriver(options);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("https://www.browserstack.com/users/sign_in");
	log.info("Open browserstack");
//	driver.manage().window().maximize();
	log.info("Maximize window size");
	js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
	log.info("enter username");
	js.executeScript("document.getElementById('user_password').value='password';");
	log.info("enter password");
	js.executeScript("document.getElementById('user_submit').click();");
	log.info("click on login");

	}
}


