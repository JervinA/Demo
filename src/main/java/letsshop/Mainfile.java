package letsshop;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import SeleniumAutomation.SeleniumAutomation.Basetest;
import SeleniumAutomation.SeleniumAutomation.Testutils;



public class Mainfile extends Basetest  {
			
	 String user = "wolverinek11@rahulshetty.com";
	 String password = "Pwdselenium@1";
	 String url = "https://rahulshettyacademy.com/client";
	 
	 private static ExtentSparkReporter sparkReporter;
		private static ExtentReports extent;
//		private static WebDriver driver;
		private static ExtentTest extentTest;  
		ExtentTest logger;	
		
		
	    	
	
	 @BeforeTest
	 
	public void openURL() throws InterruptedException {
		 
		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date());
//		 String folderPath = "F:\\Reports\\Letsshop\\" + timeStamp;
		 String folderPath = "F:\\Reports\\"  + timeStamp + "_Letshop";
		 File directory = new File(folderPath);
		 directory.mkdir();

	//	 String reportFilename = "ExtentReport_"+ timeStamp + ".html";
	//	 sparkReporter  = new ExtentSparkReporter("F:\\Reports\\" + timeStamp +".html");
		 sparkReporter  = new ExtentSparkReporter(folderPath + File.separator  + timeStamp +".html");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
	/*		logger = extent.createTest("mytestsuite", "sample dwscription");
			sparkReporter.config().setDocumentTitle("Simple automation report");
			sparkReporter.config().setReportName("Tets report");  */
			sparkReporter.config().setTheme(Theme.STANDARD);
			sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
			sparkReporter.config().setEncoding("UTF-8");
			
		 
	launchBrowser();
	 driver.get(url);

//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 Thread.sleep(15000);
	 
	 	  }

/*	 @AfterMethod

	 public void aftermymethod(ITestResult result)
	 {
		 
		
		if(result.getStatus()==ITestResult.FAILURE)
	 	{
	 		logger.fail(result.getThrowable().getMessage());
	 		
	 		
	 	}
	 	else
	 	{
	 		logger.pass("PASSED");
	 	}
		
		
		
	 	extent.flush();
	 }  */
	 
	 
	 
	 @AfterMethod
	 
	 public void aftermymethod(ITestResult result) throws IOException
	 {
		 
		
		if(result.getStatus()==ITestResult.FAILURE)
	 	{
	 		logger.fail(result.getThrowable().getMessage());
	 		logger.log(Status.FAIL, "Test failed. See screenshot below:");
	 		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH mm ss").format(new Date());
	 		logger.addScreenCaptureFromPath("F:\\Screenshots\\screenshots2"  + timeStamp + ".jpeg");
	 		
	 		
	 	}
	 	else
	 	{
	 		logger.pass("PASSED");
	 		logger.log(Status.PASS, "Test passed. See screenshot below:");
	 		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH mm ss").format(new Date());
	 		logger.addScreenCaptureFromPath("F:\\Screenshots\\screenshots2"  + timeStamp + ".jpeg");
	 	}
		
		
		
	 	extent.flush();
	 } 
	 
	 
	 
	
	 
	 
	 @Test()

	 public void login() throws InterruptedException {
		 
	
//	logger = extent.createTest("mytestsuite1", "sample dwscription");	     
		  
	 Loginpage lp=new Loginpage();
	 Thread.sleep(8000);
	 lp.enterEmail(user);
	 Thread.sleep(5000);
     lp.enterPassword(password);
	 Thread.sleep(5000);
	 lp.clickOnLogin();
	 Thread.sleep(25000);  
	 logger = extent.createTest("verify login", "sample dwscription");
 }

	 @Test(dependsOnMethods="login")

	 public void addProduct() throws InterruptedException

	 {
		// logger = extent.createTest("mytestsuite2", "sample dwscription");
		
	 Clickproduct pp=new Clickproduct(driver);
	 pp.addtocart1();
	 Thread.sleep(8000);
	 pp.addtocart2();
	 Thread.sleep(8000);
	 logger = extent.createTest("verify addproduct", "sample dwscription");
	
	 }
	 
	 @Test(dependsOnMethods="addProduct")

	 public void selectcart() throws InterruptedException
	 {
	//	 logger = extent.createTest("mytestsuite3", "sample dwscription");
		 Clickcart ck = new Clickcart(driver);
		 ck.opencart();
		 Thread.sleep(8000);
		 logger = extent.createTest("verify selectcart", "sample dwscription");
	 }
	 
	 @Test(dependsOnMethods="selectcart")
	 
	 public void checkoutoption() throws InterruptedException
	 { 
		Proceedcheckout sc = new Proceedcheckout(driver);
		 sc.scrolldown();
		 Thread.sleep(8000);
		 sc.proceedcheckout();
		 Thread.sleep(8000);
		 logger = extent.createTest("verify checkoutoption", "sample dwscription");
	 }
	 
	 @Test(dependsOnMethods="checkoutoption")
	 
	 public void aftercheckscrollup() throws InterruptedException
	 {  
		Proceedcheckout as = new Proceedcheckout(driver);
		 as.scrollup();
		 Thread.sleep(8000);
		 logger = extent.createTest("verify aftercheckscrollup", "sample dwscription");
	 }  
	 


}
