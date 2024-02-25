package letsshop;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Basesetup extends Basetest {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	
	@BeforeSuite
	
	public void setup()
	{
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter("report.html");
		extent.attachReporter(reporter);	}
	
	@AfterSuite
	
	public void teardown()
	{
		extent.flush();
	}

}
