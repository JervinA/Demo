package SeleniumAutomation.SeleniumAutomation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import Project.Logonpage;

public class Projectmainfile extends Basetest {
	
	String user = "jervinit120@gmail.com";
	String password = "Jeran11@";
	String url = "https://demo.nopcommerce.com/";
	
	@BeforeTest
	
	public void openURL() {
	launchBrowser();
	driver.get(url);
	}
	
	@Test()
	
	public void login() {
		
//	Logonpage lp = new Logonpage(driver);
//	lp.selectLogin();
	
	
	}
	

}
