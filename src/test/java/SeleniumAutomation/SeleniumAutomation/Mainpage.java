package SeleniumAutomation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import letsshop.Clickcart;
import letsshop.Clickproduct;
import letsshop.Proceedcheckout;

public class Mainpage {
	
	static WebDriver driver;

	 String user = "wolverinek11@rahulshetty.com";
	 String password = "Pwdselenium@1";
	 String url = "https://rahulshettyacademy.com/client";

	 @BeforeTest

	 public void openURL() {
	 System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Drivers\\\\chromedriver-win64\\\\chromedriver.exe");

	 driver = new ChromeDriver();
	 driver.get(url);

//	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	  }

	 @Test()

	 public void login() throws InterruptedException {

	 Loginpage lp=new Loginpage(driver);
	 Thread.sleep(8000);
	 lp.enterEmail(user);
	 Thread.sleep(5000);
	 lp.enterPassword(password);
	 Thread.sleep(5000);
	 lp.clickOnLogin();
	 Thread.sleep(20000);

	 }

	 @Test(dependsOnMethods="login")

	 public void addProduct() throws InterruptedException

	 {
	 Clickproduct pp=new Clickproduct(driver);
	 pp.addtocart1();
	 Thread.sleep(8000);
	 pp.addtocart2();
	 Thread.sleep(8000);
	 
 	 }
	 
	 @Test(dependsOnMethods="addProduct")

	 public void selectcart() throws InterruptedException
	 {
		 Clickcart ck = new Clickcart(driver);
		 ck.opencart();
		 Thread.sleep(8000);
		 
	 }
	 
	 @Test(dependsOnMethods="selectcart")
	 
	 public void checkoutoption() throws InterruptedException
	 {
		 Proceedcheckout sc = new Proceedcheckout(driver);
		 sc.scrolldown();
		 Thread.sleep(8000);
		 sc.proceedcheckout();
	 }
	 
}
