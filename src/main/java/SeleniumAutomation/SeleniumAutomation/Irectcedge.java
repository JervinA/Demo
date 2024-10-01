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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Irectcedge {
	
	 private static ExtentSparkReporter sparkReporter;
		private static ExtentReports extent;
//		private static WebDriver driver;
		private static ExtentTest extentTest;  
		ExtentTest logger;
		
		
		@BeforeTest
		 
		public void openURL() throws InterruptedException {
			 
			 String timeStamp = new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date());
			 String folderPath = "F:\\Reports\\"  + timeStamp + "_IRCTC";
			 File directory = new File(folderPath);
			 directory.mkdir();

	
			 sparkReporter  = new ExtentSparkReporter(folderPath + File.separator  + timeStamp +".html");
				extent = new ExtentReports();
				extent.attachReporter(sparkReporter);
				sparkReporter.config().setTheme(Theme.STANDARD);
				sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
				sparkReporter.config().setEncoding("UTF-8");
		}
		
	
		@AfterTest
		 
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
		 		
		 	}
			
			
			
		 	extent.flush();
		 } 
		 
		
		
	@Test

	
	public void Booking() throws InterruptedException, IOException, FindFailed {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
	//		driver.manage().window().maximize();
			Thread.sleep(15000);
			
	//		Thread.sleep(10000);
			
			driver.manage().window().maximize();
			
			Screen s= new Screen();
			
		/*	Pattern alertdismiss = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Alert.PNG");
			s.click(alertdismiss);
			Thread.sleep(5000);   
	
			WebElement line=driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i"));
			line.click();
			Thread.sleep(10000);  */
			
			Thread.sleep(10000);

		/*	Pattern loginclk = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Login.PNG");
			s.click(loginclk);
			Thread.sleep(5000); */
			
		//	driver.manage().window().maximize();
		//	Thread.sleep(20000);
			
		/*	WebElement samplefrom=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
			samplefrom.sendKeys("ch");
			Thread.sleep(3000);
			By closeloginpagepopup = By.xpath("//*[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c19-19']");
			if(driver.findElement(closeloginpagepopup).isDisplayed())
			{
				((WebElement) closeloginpagepopup).click();
			}
			else
			{
				System.out.println("Moving to next step");
			}  */
			
	/*		WebElement loginclick = driver.findElement(By.xpath("//button[@class='search_btn']"));
			loginclick.click();
			
			Thread.sleep(10000);
			
			WebElement id=driver.findElement(By.xpath("//*[@placeholder=\"User Name\"]"));
			id.sendKeys("jervin112001");
			Thread.sleep(5000);
			
			WebElement pwd=driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
			pwd.sendKeys("Irctc11@");
			Thread.sleep(5000); 
			
			 
			WebElement captc1=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
			captc1.click();
			Thread.sleep(25000);   
			
			WebElement signin=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
			signin.click();
			Thread.sleep(8000);  */
			
			WebElement from=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
			from.sendKeys("chennai");
			Thread.sleep(3000);
			
			WebElement sfrom=driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[3]"));
			sfrom.click();
			Thread.sleep(3000);
			
			
			WebElement to=driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
			to.sendKeys("coimbatore");
			Thread.sleep(3000);
			
			WebElement sto=driver.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/li[1]"));
			sto.click();
			Thread.sleep(3000);   
			
			WebElement date=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));

			Actions action=new Actions(driver);
			action.keyDown(date, Keys.LEFT_CONTROL)
			.keyDown("A");
			action.keyDown(Keys.DELETE)
			.keyUp(Keys.LEFT_CONTROL)
			.keyUp("A");
			action.keyUp(Keys.DELETE)
			.sendKeys("26/10/2024")
			.build()
		    .perform();
			

			WebElement submit=driver.findElement(By.xpath("(//button[@class='search_btn train_Search'])[1]"));
			submit.click();
			Thread.sleep(8000);
			
			WebElement sort=driver.findElement(By.xpath("//*[@class='active btnDefault']"));
			sort.click();
			Thread.sleep(3000);
			

			
		/*	Pattern earlydept = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\DAF.PNG");
			s.click(earlydept);
			Thread.sleep(5000);  */
			
			WebElement earlydept = driver.findElement(By.xpath("(//button[contains(text(),'Departure')])[1]"));
			earlydept.click();
			

			
			Actions actions = new Actions(driver);
			
			WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'WEST COAST EXP')]/following::div[contains(text(),'Refresh')])[1]"));
	        actions.moveToElement(element).build().perform();

			
	
			 Thread.sleep(3000);
			
			WebElement sclick=driver.findElement(By.xpath("(//*[contains(text(),'WEST COAST EXP')]/following::div[contains(text(),'Refresh')])[1]"));
			sclick.click();
			Thread.sleep(3000);
			
		
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,90)","" ); 
			 Thread.sleep(3000);
			
			 WebElement avblclick = driver.findElement(By.xpath("(//span[contains(text(),'Sleeper (SL)')]/following::div)[14]"));
			 avblclick.click();
			 Thread.sleep(2000);
			 
			 WebElement booknow = driver.findElement(By.xpath("(//span[contains(text(),'Sleeper (SL)')]/following::button[contains(text(),'Book Now')])[1]"));
			 booknow.click();
			 Thread.sleep(2000);
			 
			 WebElement id=driver.findElement(By.xpath("//input[@placeholder='User Name']"));
				id.sendKeys("jervin112001");
				Thread.sleep(5000);
				
				WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				pwd.sendKeys("Irctc11@");
				Thread.sleep(5000); 
				
				 
				WebElement captc1=driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']"));
				captc1.click();
				Thread.sleep(20000);   
				
				WebElement signin=driver.findElement(By.xpath("//*[contains(text(),'SIGN IN')]"));
				signin.click();
				Thread.sleep(8000);
			 
	/*		Pattern avbl = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Available.PNG");
			s.click(avbl);
			Thread.sleep(5000);
			
			Pattern bknow = new Pattern("C:\\Users\\c.JERVIN\\Documents\\IRECTC\\Booknow.PNG");
			s.click(bknow);
			Thread.sleep(5000);
			
	
	
			
			WebElement pas1=driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[1]/p-autocomplete/span/input"));
			pas1.sendKeys("Jervin");
			Thread.sleep(3000);
			
			WebElement age1=driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[2]/input"));
			age1.sendKeys("22");
			Thread.sleep(3000);
			
			Select gen1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[3]/select")));
			Thread.sleep(3000);
			gen1.selectByVisibleText("Male");
			
			Select birth1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/div[1]/select")));
			Thread.sleep(3000);
			birth1.selectByVisibleText("Upper");
			
            Actions scdm = new Actions(driver);
			
			WebElement scrndwn = driver.findElement(By.xpath("//button[@class='train_Search btnDefault']"));
			scdm.moveToElement(scrndwn).build().perform();
			
	
			 
			 WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"2\"]/div/div[2]/span"));
			 checkbox.click();
			Thread.sleep(3000);
			
			WebElement contin=driver.findElement(By.xpath("//button[@class='train_Search btnDefault']"));
			contin.click();
			Thread.sleep(3000);
			
			JavascriptExecutor jssssss=(JavascriptExecutor)driver;
			 jssssss.executeScript("window.scrollBy(0,100)","" );
			 Thread.sleep(5000);
			 
			 WebElement captcha=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
			 captcha.click();
			Thread.sleep(10000);
			 
			 WebElement continu=driver.findElement(By.xpath("//*[@id=\"review\"]/div[1]/form/div[3]/div/button[2]"));
			 continu.click();
			Thread.sleep(3000);
			
	
			 
			 WebElement bhim=driver.findElement(By.xpath("//*[@id=\"pay-type\"]/span/div[3]/span"));
			 bhim.click();
			Thread.sleep(3000);
			
			WebElement bhimclick=driver.findElement(By.xpath("(//div[@class='col-pad col-xs-12 bank-text']//following::*[@class='col-pad'])[1]"));
			bhimclick.click();
			Thread.sleep(3000);
			
			WebElement paymow=driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/div[1]/div[1]/app-payment/div[2]/button[2]"));
			paymow.click();
			Thread.sleep(6000); 
			
	/*		WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement number = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element_id")));
			number.click();  */
			
			TakesScreenshot screenshot1=(TakesScreenshot)driver;
			 File file1=screenshot1.getScreenshotAs(OutputType.FILE);
			 File destination1=new File("F:\\Screenshots\\IRCTC\\screenshots1.jpeg");
			 FileHandler.copy(file1, destination1);    
			 
		
	}
	
	
	
	
}
