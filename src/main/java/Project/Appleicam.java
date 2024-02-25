package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Appleicam extends Basetest {
	
	public Appleicam(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By electronics=By.xpath("(//a[@title='Show products in category Electronics'])[1]");
	By camera=By.xpath("(//a[@title='Show products in category Camera & photo'])[1]");
	By nikkonaddcart=By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
	By addtocart=By.xpath("//button[@id='add-to-cart-button-14']");
	By shoppingcart=By.xpath("//span[@class='cart-label']");
	By checkcart=By.partialLinkText("Nikon D5500 DSLR - Black");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	public void selectelectronics()
	{
		driver.findElement(electronics).click();
	}
	
	public void selectcamera()
	{
		driver.findElement(camera).click();
	}
	
	public void selectnikkoncart()
	{
		driver.findElement(nikkonaddcart).click();
	}
	
	public void selectaddtocart()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,300)","" );
		driver.findElement(addtocart).click();
	}   
	
	public void selectshoppingcart()
	{
		driver.findElement(shoppingcart).click();
	}
	
	public void tocheckcart()
	{
	//	driver.findElement(checkcart).isEnabled();
		String expectedproductname = "Nikon D5500 DSLR - Black";
		String actualproductname = driver.findElement(checkcart).getText();
		Assert.assertEquals(actualproductname, expectedproductname, "Title not match");
		
		
	}
	
	public void clicklogout()
	{
		driver.findElement(logout).click();
		driver.quit();
	}
	

}
