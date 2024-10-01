package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draw {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/whiteboard.htm");
//		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		WebElement canvas=driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
/*		line.click();
		Thread.sleep(10000);
		
		Actions action=new Actions(driver);
		action.clickAndHold().dragAndDropBy(line, 40, 90);
		action.clickAndHold(line).dragAndDropBy(line, 100, 200);
		action.perform();  */
		
		Actions builder = new Actions(driver);
		builder.moveToElement(canvas, 50, 50)
		.clickAndHold()
		.moveByOffset(0, 150)
		.moveByOffset(1, 0)
		.moveByOffset(0, 150)
	/*	.moveByOffset(0, -90)
		.moveByOffset(200, 0)
		.moveByOffset(0, -90)
		.moveByOffset(50, 0)
		.moveByOffset(0, 50)
		.moveByOffset(-90, 0)
		.moveByOffset(0, 200)
		.moveByOffset(0, -50)  */
		.release()
		.perform();
		
	}

}
