package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	
	private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setup() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
        // Initialize the WebDriver instance
        driver = new EdgeDriver();
        
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date());
//		 String folderPath = "F:\\Reports\\Letsshop\\" + timeStamp;
		 String folderPath = "F:\\Reports\\"  + timeStamp + "_IRCTC";
		 File directory = new File(folderPath);
		 directory.mkdir();
        
        // Initialize ExtentReports
        extent = new ExtentReports();
        // Create a HTML reporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(folderPath + File.separator  + timeStamp +".html");
        extent.attachReporter(htmlReporter);
    }
    
    
    
    

    @Test
    public void testExtentReport() throws InterruptedException, FindFailed, IOException {
        // Start a test
        test = extent.createTest("Extent Report Test", "Sample description");
        // Log some information
        test.log(Status.INFO, "Starting the test");
        // Navigate to a webpage
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(30000);
        // Log a pass status
        test.pass("Navigated to Example website successfully");
        
        test.log(Status.INFO, "Closing the alert");
         Screen s= new Screen();
		
		Pattern alertdismiss = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Alert.PNG");
		s.click(alertdismiss);
		test.pass("Alert closed");
		Thread.sleep(5000);
		
		test.log(Status.INFO, "Clicking the line");
		WebElement line=driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i"));
		line.click();
		test.pass("Lines clicked");
		Thread.sleep(10000);
		
		test.log(Status.INFO, "Clicking the login");
		Pattern loginclk = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Login.PNG");
		s.click(loginclk);
		test.pass("Login clicked");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		test.log(Status.INFO, "Entering the user_ID");
		WebElement id=driver.findElement(By.xpath("//*[@placeholder=\"User Name\"]"));
		id.sendKeys("jervin112001");
		test.pass("User_ID entered");
		Thread.sleep(5000);
		
		test.log(Status.INFO, "Entering the Password");
		WebElement pwd=driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
		pwd.sendKeys("Irctc11@");
		test.pass("Password entered");
		Thread.sleep(5000); 
		
		test.log(Status.INFO, "Entering the Captcha");
		WebElement captc1=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
		captc1.click();
		test.pass("Captcha entered");
		Thread.sleep(25000); 
		
		test.log(Status.INFO, "Clicking the Signin");
		WebElement signin=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		signin.click();
		test.pass("Signin clicked");
		Thread.sleep(8000);
		
		test.log(Status.INFO, "Entering the From_location");
		WebElement from=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		from.sendKeys("chennai");
		test.pass("From_location entered");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Selecting the From_location");
		WebElement sfrom=driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[3]"));
		sfrom.click();
		test.pass("From_location selected");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Entering the To_location");
		WebElement to=driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
		to.sendKeys("coimbatore");
		test.pass("To_location entered");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Selecting the To_location");
		WebElement sto=driver.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/li[1]"));
		sto.click();
		test.pass("To_location selected");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Entering the date");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));

		Actions action=new Actions(driver);
		action.keyDown(date, Keys.LEFT_CONTROL)
		.keyDown("A");
		action.keyDown(Keys.DELETE)
		.keyUp(Keys.LEFT_CONTROL)
		.keyUp("A");
		action.keyUp(Keys.DELETE)
		.sendKeys("27/07/2024")
		.build()
	    .perform();
		test.pass("Date entered");
		
		test.log(Status.INFO, "Clicking the submit");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[2]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
		submit.click();
		test.pass("Submit clicked");
		Thread.sleep(8000);
		
		test.log(Status.INFO, "Clicking the sort");
		WebElement sort=driver.findElement(By.xpath("//*[@class='active btnDefault']"));
		sort.click();
		test.pass("Sort clicked");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking the early_departure");
		Pattern earlydept = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\DAF.PNG");
		s.click(earlydept);
		test.pass("Early_departure clicked");
		Thread.sleep(5000);
		
		test.log(Status.INFO, "Scrolling down");
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='col-xs-12 link'])[12]"));
        actions.moveToElement(element).build().perform();
        test.pass("Scrolling down completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking SL");
		WebElement sclick=driver.findElement(By.xpath("(//div[@class='col-xs-12 link'])[12]"));
		sclick.click();
		test.pass("Clicking SL completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Scrolling down");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,100)","" ); 
		 test.pass("Scrolling down completed");
		 Thread.sleep(3000);
		
		 test.log(Status.INFO, "Clicking Available");
		Pattern avbl = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Available.PNG");
		s.click(avbl);
		test.pass("Clicking Available completed");
		Thread.sleep(5000);
		
		test.log(Status.INFO, "Clicking Booknow");
		Pattern bknow = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Booknow.PNG");
		s.click(bknow);
		test.pass("Clicking Booknow completed");
		Thread.sleep(5000);
		
		test.log(Status.INFO, "Entering passenger name");
		WebElement pas1=driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[1]/p-autocomplete/span/input"));
		pas1.sendKeys("Jervin");
		test.pass("Entering passenger name completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Entering passenger age");
		WebElement age1=driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[2]/input"));
		age1.sendKeys("22");
		test.pass("Entering passenger age completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Entering passenger gender");
		Select gen1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[3]/select")));
		Thread.sleep(3000);
		gen1.selectByVisibleText("Male");
		test.pass("Entering passenger age completed");
		
		test.log(Status.INFO, "Selecting passenger birth");
		Select birth1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/div[1]/select")));
		Thread.sleep(3000);
		birth1.selectByVisibleText("Upper");
		test.pass("Selecting passenger birth completed");
		
		test.log(Status.INFO, "Scrolling down");
        Actions scdm = new Actions(driver);
		
		WebElement scrndwn = driver.findElement(By.xpath("//button[@class='train_Search btnDefault']"));
		scdm.moveToElement(scrndwn).build().perform();
		test.pass("Scrolling down completed");
		
		test.log(Status.INFO, "Clicking check box");
		 WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"2\"]/div/div[2]/span"));
		 checkbox.click();
		 test.pass("Clicking check box completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking Continue");
		WebElement contin=driver.findElement(By.xpath("//button[@class='train_Search btnDefault']"));
		contin.click();
		test.pass("Clicking Continue completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Scrolling down");
		JavascriptExecutor jssssss=(JavascriptExecutor)driver;
		 jssssss.executeScript("window.scrollBy(0,100)","" );
		 test.pass("Scrolling down completed");
		 Thread.sleep(5000);
		 
		 test.log(Status.INFO, "Entering captcha");
		 WebElement captcha=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
		 captcha.click();
		 test.pass("Entering captcha completed");
		Thread.sleep(10000);
		 
		test.log(Status.INFO, "Clicking Continue");
		 WebElement continu=driver.findElement(By.xpath("//*[@id=\"review\"]/div[1]/form/div[3]/div/button[2]"));
		 continu.click();
		 test.pass("Clicking Continue completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking BHIM");
		 WebElement bhim=driver.findElement(By.xpath("//*[@id=\"pay-type\"]/span/div[3]/span"));
		 bhim.click();
		 test.pass("Clicking BHIM completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking BHIMclick");
		WebElement bhimclick=driver.findElement(By.xpath("(//div[@class='col-pad col-xs-12 bank-text']//following::*[@class='col-pad'])[1]"));
		bhimclick.click();
		test.pass("Clicking BHIMclick completed");
		Thread.sleep(3000);
		
		test.log(Status.INFO, "Clicking paynow");
		WebElement paymow=driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/div[1]/div[1]/app-payment/div[2]/button[2]"));
		paymow.click();
		test.pass("Clicking paynow completed");
		Thread.sleep(6000); 
		
/*		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement number = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element_id")));
		number.click();  */
		
		test.log(Status.INFO, "Taking screenshot");
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		 File file1=screenshot1.getScreenshotAs(OutputType.FILE);
		 File destination1=new File("F:\\Screenshots\\IRCTC\\screenshots1.jpeg");
		 FileHandler.copy(file1, destination1); 
		 test.pass("Taking screenshot completed");
		{
			 test.fail("Test failed"); 
		 }
		 
		 
		 
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver instance
        driver.quit();
        // Flush the report
        extent.flush();
    }
	

}
