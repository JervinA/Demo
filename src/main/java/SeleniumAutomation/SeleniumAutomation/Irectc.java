package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Irectc {
	
	
@Test

	
public static void Booking() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.manage().window().maximize();
		Thread.sleep(40000);
		
		Alert Prompt = driver.switchTo().alert();
		Prompt.dismiss();
		
		WebElement line=driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i"));
		line.click();
		Thread.sleep(10000);
		
		WebElement logclk=driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/div/label/button"));
		logclk.click();
		Thread.sleep(30000);
		
		WebElement id=driver.findElement(By.xpath("//*[@placeholder=\"User Name\"]"));
		id.sendKeys("jervin112001");
		Thread.sleep(20000);
		
		WebElement pwd=driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
		pwd.sendKeys("Irctc11@");
		Thread.sleep(10000); 
		
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,400)","" );
		 Thread.sleep(9000);
		 
		WebElement captc1=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
		captc1.click();
		Thread.sleep(15000);   
		
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button"));
		signin.click();
		Thread.sleep(8000);
		
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
//		date.click();
/*		WebElement next=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span"));
		next.click();   */
/*		WebElement sdate=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[1]/td[6]/a"));
		sdate.click();
		Thread.sleep(3000);   */
		
		Actions action=new Actions(driver);
		action.keyDown(date, Keys.LEFT_CONTROL)
		.keyDown("A");
		action.keyDown(Keys.DELETE)
		.keyUp(Keys.LEFT_CONTROL)
		.keyUp("A");
		action.keyUp(Keys.DELETE)
		.sendKeys("27/12/2023")
		.build()
	    .perform();
		
/*		WebElement fclick=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/div/span[2]"));
		fclick.click();
		Thread.sleep(3000);   */
		
/*		WebElement birth=driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div"));
		birth.click();
		Thread.sleep(3000);
		
		WebElement bselect=driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[12]/li"));
		bselect.click();
		Thread.sleep(3000);    */
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[2]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
		submit.click();
		Thread.sleep(8000);
		
		WebElement sort=driver.findElement(By.xpath("//*[@class='active btnDefault']"));
		sort.click();
		Thread.sleep(3000);
		
		WebElement efirst=driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/button"));
		efirst.click();
		Thread.sleep(3000);
		
/*		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[4]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div/div[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		 js.executeScript("arguments[0].scrollIntoView()",scroll );
		Thread.sleep(3000);   */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)","" );
		 Thread.sleep(3000);
		
		WebElement sclick=driver.findElement(By.xpath("(//*[text()='13:25']//following::*[@class='col-xs-12 link'])[1]"));
		sclick.click();
		Thread.sleep(3000);
		
		WebElement tclick=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[3]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div/div[2]"));
		tclick.click();
		Thread.sleep(3000);
		
		WebElement tbook=driver.findElement(By.xpath("//*[text()='Sleeper (SL)']//following::*[@class='btnDefault train_Search ng-star-inserted']"));
		tbook.click();
		Thread.sleep(8000);
		
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		 jss.executeScript("window.scrollBy(0,400)","" );
		 Thread.sleep(3000);
		
/*		WebElement box=driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[5]"));
		box.click();
		Thread.sleep(3000);
		
		WebElement proc=driver.findElement(By.xpath("//*[@id=\"divMain\"]/app-login/p-dialog[2]/div/div/div[2]/div/form/div[2]/button[1]"));
		proc.click();
		Thread.sleep(3000);   */
		
		
		
		JavascriptExecutor jssss=(JavascriptExecutor)driver;
		 jssss.executeScript("window.scrollBy(0,600)","" );
		 Thread.sleep(3000);
		
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
		
		JavascriptExecutor jsssss=(JavascriptExecutor)driver;
		 jsssss.executeScript("window.scrollBy(0,600)","" );
		 Thread.sleep(3000);
		 
		 WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"2\"]/div/div[2]/span"));
		 checkbox.click();
		Thread.sleep(3000);
		
		WebElement contin=driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/form/div/div[1]/div[14]/div/button[2]"));
		contin.click();
		Thread.sleep(3000);
		
		JavascriptExecutor jssssss=(JavascriptExecutor)driver;
		 jssssss.executeScript("window.scrollBy(0,600)","" );
		 Thread.sleep(5000);
		 
		 WebElement captcha=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
		 captcha.click();
		Thread.sleep(10000);
		 
		 WebElement continu=driver.findElement(By.xpath("//*[@id=\"review\"]/div[1]/form/div[3]/div/button[2]"));
		 continu.click();
		Thread.sleep(3000);
		
		JavascriptExecutor jsssssss=(JavascriptExecutor)driver;
		 jsssssss.executeScript("window.scrollBy(0,400)","" );
		 Thread.sleep(5000);
		 
		 WebElement bhim=driver.findElement(By.xpath("//*[@id=\"pay-type\"]/span/div[3]/span"));
		 bhim.click();
		Thread.sleep(3000);
		
		WebElement bhimclick=driver.findElement(By.xpath("(//div[@class='col-pad col-xs-12 bank-text']//following::*[@class='col-pad'])[1]"));
		bhimclick.click();
		Thread.sleep(3000);
		
		WebElement paymow=driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/div[1]/div[1]/app-payment/div[2]/button[2]"));
		paymow.click();
		Thread.sleep(3000);
		
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		 File file1=screenshot1.getScreenshotAs(OutputType.FILE);
		 File destination1=new File("F:\\Screenshots\\IRCTC\\screenshots1.jpeg");
		 FileHandler.copy(file1, destination1);
		 
	
}
	
}
