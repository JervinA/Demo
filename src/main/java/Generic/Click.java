package Generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click {
	
	protected WebDriver driver;
	public WebDriverWait wait;
	
	public Click(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15) );
	}
	
	protected void click(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	protected void sendKeys(By locator, String text) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(text);
	}
}