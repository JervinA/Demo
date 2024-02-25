package SeleniumAutomation.SeleniumAutomation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import letsshop.Basesetup;

public class Redbus  {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
		Thread.sleep(25000);
//		String parentwindow = driver.getWindowHandle();
		
		WebElement account=driver.findElement(By.xpath("(//span[@class=\"name_rb_secondary_item\"])[2]"));
		account.click();
		
        Thread.sleep(5000);
        
        WebElement loginsignin=driver.findElement(By.xpath("//*[@id=\"user_sign_in_sign_up\"]"));
        loginsignin.click();
        Thread.sleep(3000);
        
  //      List<WebElement> frames=driver.findElements(By.id("iframe"));
  //      driver.switchTo().frame(0);
 //       driver.switchTo().frame("//iframe[@class='modalIframe']");
        
  /*      List<WebElement> frames=driver.findElements(By.tagName("iframe"));
    	System.out.println(frames.size());
		
		driver.switchTo().frame("courses-iframe");
        
		Thread.sleep(15000);
				
/*		WebElement number=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		number.sendKeys("1234");
		Thread.sleep(3000);		
        
        WebElement google=driver.findElement(By.xpath("//span[@class=\"nsm7Bb-HzV7m-LgbsSe-BPrWId\"]"));
        google.click();
        Thread.sleep(3000);   */
        
        driver.getWindowHandles();
    	driver.switchTo().newWindow(WindowType.TAB);
    	driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fgsi%2Fselect%3Fclient_id%3D231171689615-idianhahjhk2s9rdlr1hrd9e2a09b3cj.apps.googleusercontent.com%26ux_mode%3Dpopup%26ui_mode%3Dcard%26as%3DhB7J3oHoxrS9EBsbkBBGNw%26channel_id%3Dc6400be1f75279b2532e19785c15196ad57464929cf65a125f6ad18f02bcd6ed%26origin%3Dhttps%3A%2F%2Fwww.redbus.in&faa=1&ifkv=ASKXGp1gYn3r4ajmuFo9__IRK7adObP6CFSHjdF1a1bNdl7wt6kHpx3-U5n_7tP6Mo9FeIDKHRDX&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1762453233%3A1707060685257257&theme=glif");
    	Thread.sleep(10000);
    	
    	WebElement entermail=driver.findElement(By.xpath("//input[@type=\"email\"]"));
    	entermail.sendKeys("1234");
		Thread.sleep(3000);
    	
    	
        
			
		

}
}