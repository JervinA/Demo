package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.JavascriptExecutor;

public class TestLog extends Basetest {
	

	public static void main(String[] args) {
		
		
	
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
