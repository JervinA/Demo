package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drawing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/whiteboard.htm");
//		driver.manage().window().maximize();
		Thread.sleep(30000);
	/*	WebElement textToolButton = driver.findElement(By.xpath(""));
		textToolButton.click();  */
		
		int xCoordinate = 200;
		int yCoordinate = 150;
		
		WebElement whiteboardCanvas = driver.findElement(By.xpath("//*[@id=\"canvasBoardDiv1\"]/div/canvas[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(whiteboardCanvas, xCoordinate, yCoordinate).click().perform();
		actions.sendKeys("Brindha").perform();
		
		
	}




	}


