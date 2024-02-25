package SeleniumAutomation.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	
	public static void main(String[] args) throws InterruptedException {
	{
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		
/*		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1400)", "");
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(3000);
		
		WebElement blog=driver.findElement(By.xpath("(//li/a[text()='Blog'])[1]"));
		blog.click();
		driver.switchTo().parentFrame();
		
		js.executeScript("window.scrollBy(0,-900)", "");  */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame("overflow-y: auto; height: 195px;");
		Thread.sleep(3000);
		
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,200)", "");
		
	}

	}
}
