package letsshop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SeleniumAutomation.SeleniumAutomation.Basetest;


public class Clickproduct extends Basesetup {
	
	WebDriver driver;

	 public Clickproduct(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}

	By Zara=By.xpath("//*[@id=\"products\"]/div[1]/div[2]/div[1]/div/div/button[2]");
	By Adidas=By.xpath("//*[@id=\"products\"]/div[1]/div[2]/div[2]/div/div/button[2]");
	 
	 
	
	  public void addtocart1()
	 {
		  
	 driver.findElement(Zara).click();
	 }
	  
	  public void addtocart2()
		 {
		    
		 driver.findElement(Adidas).click();
		 }
	  
	 
	  
	  
	 
	  
}
