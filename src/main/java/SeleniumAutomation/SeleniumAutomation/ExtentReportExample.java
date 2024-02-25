package SeleniumAutomation.SeleniumAutomation;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class ExtentReportExample {
	    WebDriver driver;
	    ExtentReports extent;
	    ExtentTest logger;

	    @BeforeMethod
	    public void setUp() {
	        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/extentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        logger = extent.createTest("MyTest");
	        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
	    }

	    @Test
	    public void test() throws InterruptedException {
	        logger.log(Status.INFO, "Test Started");
	        driver.get("https://rahulshettyacademy.com/client");
	        Thread.sleep(25000);
	        logger.log(Status.INFO, "Navigated to example.com");
	        logger.log(Status.PASS, "Test Passed");
	    }
	    
	    @Test
	    
	    public void login() throws InterruptedException {
	    	logger.log(Status.INFO, "Test Started");
		    WebElement usernname=driver.findElement(By.xpath("//input[@id='userEmail']"));
		    usernname.sendKeys("wolverinek11@rahulshetty.com");
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.xpath("//input[@id='userPassword']"));
			password.sendKeys("Pwdselenium@1");
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
			login.click();
			logger.log(Status.INFO, "logged in to app");
	        logger.log(Status.PASS, "Test Passed");
	    }
	    
	    

	    @AfterMethod
	    public void tearDown() {
	       // driver.quit();
	        extent.flush();
	    }
	}



