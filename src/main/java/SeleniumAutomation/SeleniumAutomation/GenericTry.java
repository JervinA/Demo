package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import Generic.Click;

public class GenericTry extends Click {
	
	private By usernamefield = By.xpath("//*[@id=\"APjFqb\"]");

	public GenericTry(WebDriver driver) {
		super(driver);
		
	}

	

	public void click(String username) {
		sendKeys(usernamefield, username);
		
	}
	

}
