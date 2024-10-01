package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Loginfile extends Basetest {
	
	
	
	public Loginfile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		


		 By login=By.xpath("//a[@class='ico-login']");
		 By email=By.xpath("//input[@class='email']");
		 By password=By.xpath("//input[@class='password']");
		 By loginbutton=By.xpath("(//button[@type='submit'])[2]");
		 By verifylogin=By.partialLinkText("Log out");
		 
		 

		public void selectLogin()
		 {
		 driver.findElement(login).click();
		 }

		 public void enterEmail(String username)
		 {
		 driver.findElement(email).sendKeys("jervinit120@gmail.com");
		 }

		 public void enterPassword(String userpassword)
		 {
		 driver.findElement(password).sendKeys("Jeran11@");
		 }

		 public void clickOnLogin()
		 {
		 driver.findElement(loginbutton).click();
		 }
		 
		 public void clickverifylogin()
		 {
			 String expectedname = "Log out";
			 String actualname = driver.findElement(verifylogin).getText();
			 Assert.assertEquals(actualname, expectedname, "Title not match");
		 }


}
