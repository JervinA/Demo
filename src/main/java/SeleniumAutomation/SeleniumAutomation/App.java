package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class App {
	
	@Test
  
public static void first() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		 WebElement cauliflower=driver.findElement(By.xpath("//h4[contains(text(),'Cauliflower')]/../div[3]/button"));

		 cauliflower.click();

		 Thread.sleep(3000);
		 
		 TakesScreenshot screenshot=(TakesScreenshot)driver;

		 File file=screenshot.getScreenshotAs(OutputType.FILE);

		 File destination=new File("F:\\Screenshots\\screenshots2.jpeg");

		 FileHandler.copy(file, destination);


		 WebElement cart=driver.findElement(By.className("cart-icon"));

		 cart.click();

		 WebElement proceed=driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));

		 proceed.click();

		 WebElement enterpromocode=driver.findElement(By.xpath("//input[@class='promoCode']"));

		 System.out.println(enterpromocode.isDisplayed());

		 enterpromocode.sendKeys("rahulshettyacadem");

		 WebElement apply=driver.findElement(By.xpath("//button[@class='promoBtn']"));

		 apply.click();
		 
		 
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		 String promoresponse=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();

		 if(promoresponse.equals("Code applied ..!"))

		 {

		  System.out.println("Valid");

		 }else

		 {

		  System.out.println(promoresponse);

		 }
		 
		 TakesScreenshot screenshot1=(TakesScreenshot)driver;

		 File file1=screenshot1.getScreenshotAs(OutputType.FILE);

		 File destination1=new File("F:\\Screenshots\\screenshots4.jpeg");

		 FileHandler.copy(file1, destination1);
		
	
  }
}
