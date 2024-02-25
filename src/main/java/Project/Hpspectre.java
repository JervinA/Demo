package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Hpspectre extends Basetest {
	
	public Hpspectre(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By search=By.xpath("//input[@id='small-searchterms']");
	By searchbutton=By.xpath("//button[@class='button-1 search-box-button']");
	By verify=By.partialLinkText("HP Spectre XT Pro UltraBook");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	public void entersearch()
	{
		driver.findElement(search).sendKeys("HP Spectre XT Pro UltraBook");
	}
	
	public void selectsearch()
	{
		driver.findElement(searchbutton).click();
	}
	
	public void clickverify()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,300)","" );
		String expectedproductname = "HP Spectre XT Pro UltraBook";
		String actualproductname = driver.findElement(verify).getText();
		Assert.assertEquals(actualproductname, expectedproductname, "Title not match");
	}
	
	public void selectlogout()
	{
		driver.findElement(logout).click();
	}

}





