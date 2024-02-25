package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Orderdetails extends Basetest {
	
	public Orderdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By myorders=By.partialLinkText("Orders");
	By details=By.xpath("(//button[@class='button-2 order-details-button'])[1]");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	public void selectorders()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,800)","" );
		driver.findElement(myorders).click();
	}
	
	public void selectdetails()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,300)","" );
		driver.findElement(details).click();
	}
	
	public void selectlogout()
	{
		driver.findElement(logout).click();
	}

}
