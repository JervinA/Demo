package Sampleletshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Login extends Basetest {
	
	WebDriver driver;

         public Login(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}  

	
	By email=By.xpath("//input[@id='userEmail']");
	 By password=By.xpath("//input[@id='userPassword']");
	 By loginbutton=By.xpath("//input[@id='login']");

	 public void enterEmail(String username)
	 {
		
	 driver.findElement(email).sendKeys(username);
	 }

	 public void enterPassword(String userpassword)
	 {
	 
	 driver.findElement(password).sendKeys(userpassword);
	 }

	 public void clickOnLogin()
	 {
	 
	 driver.findElement(loginbutton).click();
	 }  
	

}
