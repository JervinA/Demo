package Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Elegantscreenshot extends Basetest {
	
	public Elegantscreenshot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By search=By.xpath("//input[@id='small-searchterms']");
	By searchbutton=By.xpath("//button[@class='button-1 search-box-button']");
	
	public void entersearch()
	{
		driver.findElement(search).sendKeys("Elegant Gemstone Necklace (rental)");
	}
	
	public void clicksearchbutton() throws InterruptedException, IOException
	{
		driver.findElement(searchbutton).click();
		Thread.sleep(5000);
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,300)","" );
		Thread.sleep(5000);
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		 File file1=screenshot1.getScreenshotAs(OutputType.FILE);
		 File destination1=new File("F:\\Screenshots\\Project\\Elegant product\\screenshots1.jpeg");
		 FileHandler.copy(file1, destination1);
		 
	}

}
