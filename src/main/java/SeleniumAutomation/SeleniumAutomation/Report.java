package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.BeforeAll;

    public class Report {
	
	private static ExtentSparkReporter sparkReporter;
	private static ExtentReports extent;
	private static WebDriver driver;
	private static ExtentTest extentTest;  
    	
    	ExtentTest logger;
   // 	ExtentReports extent;
    	String url = "https://demo.nopcommerce.com/";
	
@BeforeTest


	public void setup() {
	
/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);  */
	
	
	sparkReporter  = new ExtentSparkReporter("sample.html");
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
/*	logger = extent.createTest("mytestsuite", "sample dwscription");
	sparkReporter.config().setDocumentTitle("Simple automation report");
	sparkReporter.config().setReportName("Tets report");*/
	sparkReporter.config().setTheme(Theme.STANDARD);
	sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
	sparkReporter.config().setEncoding("UTF-8");
	
	
	
}
	
	
	
	
/*	sparkReporter.config().setDocumentTitle("Simple automation report");
	sparkReporter.config().setReportName("Tets report");
	sparkReporter.config().setTheme(Theme.STANDARD);
	sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
	sparkReporter.config().setEncoding("UTF-8");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	//	driver.manage().window().maximize();
	Thread.sleep(40000);
	
	}*/


@AfterMethod

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
}

@Test()
public void method1() {
	
	logger = extent.createTest("mytestsuite1", "sample dwscription");
	System.out.println("method1");
}

@Test()
public void method2() {
	logger = extent.createTest("mytestsuite2", "sample dwscription");
	System.out.println("method2");
}






}
