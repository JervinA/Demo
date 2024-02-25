package letsshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Loginpage extends Basesetup {
	
	
	
	WebDriver driver;

	 public void LoginPage() {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }

	 By email=By.xpath("//input[@id='userEmail']");
	 By password=By.xpath("//input[@id='userPassword']");
	 By loginbutton=By.xpath("//input[@id='login']");

	 public void enterEmail(String username)
	 {
		
	 driver.findElement(email).sendKeys();
	 }

	 public void enterPassword(String userpassword)
	 {
	 
	 driver.findElement(password).sendKeys();
	 }

	 public void clickOnLogin()
	 {
	 
	 driver.findElement(loginbutton).click();
	 }  
	
}
