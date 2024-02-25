package letsshop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import SeleniumAutomation.SeleniumAutomation.Basetest;
import SeleniumAutomation.SeleniumAutomation.Loginpage;



public class Mainfile extends Basetest {
			
	 String user = "wolverinek11@rahulshetty.com";
	 String password = "Pwdselenium@1";
	 String url = "https://rahulshettyacademy.com/client";
	 
/*	 ExtentReports extent;
	 ExtentTest logger;    */
	 

	 @BeforeTest
	 
	public void openURL() throws InterruptedException {
	launchBrowser();
	 driver.get(url);

//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 Thread.sleep(15000);
	 
	 	  }
	 
	// @BeforeMethod
	 
/*	 public void setUp() {
	        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Report.html");
	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        logger = extent.createTest("MyTest");
	        
	 }    */
	 

/*	 @Test()
	 public void test() {
	        logger.log(Status.INFO, "Test Started");
	        driver.get(url);
	        logger.log(Status.INFO, "Navigated to leyshop.com");
	        logger.log(Status.PASS, "Test Passed");
	    }   */
	 

	 @Test()

	 public void login() throws InterruptedException {
		 
	/*	 logger.log(Status.INFO, "test started");
		 
		 logger.log(Status.INFO, "Loogged in to letyshop.com");  */
		     
		  
	 Loginpage lp=new Loginpage(driver);
	 Thread.sleep(8000);
	 lp.enterEmail(user);
	 Thread.sleep(5000);
     lp.enterPassword(password);
	 Thread.sleep(5000);
	 lp.clickOnLogin();
	 Thread.sleep(25000);  
	 
//	 logger.log(Status.PASS, "Test Passed");
	 

	// }

//	 @Test(dependsOnMethods="login")

//	 public void addProduct() throws InterruptedException

//	 {
	/*	 logger.log(Status.INFO, "add product started");
		 logger.log(Status.INFO, "Navigated to add product");  */
		
	 Clickproduct pp=new Clickproduct(driver);
	 pp.addtocart1();
	 Thread.sleep(8000);
	 pp.addtocart2();
	 Thread.sleep(8000);
	 
	
//     logger.log(Status.PASS, "Test Passed");
	 
	
	 
/*	 }
	 
	 @Test(dependsOnMethods="addProduct")

	 public void selectcart() throws InterruptedException
	 {*/
		 Clickcart ck = new Clickcart(driver);
		 ck.opencart();
		 Thread.sleep(8000);
		 
/*	 }
	 
	 @Test(dependsOnMethods="selectcart")
	 
	 public void checkoutoption() throws InterruptedException
	 { */
		 Proceedcheckout sc = new Proceedcheckout(driver);
		 sc.scrolldown();
		 Thread.sleep(8000);
		 sc.proceedcheckout();
		 Thread.sleep(8000);
/*	 }
	 
	 @Test(dependsOnMethods="checkoutoption")
	 
	 public void aftercheckscrollup() throws InterruptedException
	 {  */
		 Proceedcheckout as = new Proceedcheckout(driver);
		 as.scrollup();
		 Thread.sleep(8000);
	 }  
	 
/*	 @AfterMethod
	    public void tearDown() {
	        
	        extent.flush();
	    }
*/

}
