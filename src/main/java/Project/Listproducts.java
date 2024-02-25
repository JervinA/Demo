package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Listproducts extends Basetest {
	
	public Listproducts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By computer=By.partialLinkText("Computers");
	By notebooks=By.partialLinkText("Notebooks");
	By mackbook=By.partialLinkText("Apple MacBook Pro 13-inch");
	By electronics=By.partialLinkText("Electronics");
	By camandphoto=By.partialLinkText("Camera & photo");
	By appleicam=By.partialLinkText("Apple iCam");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	
	public void selectcomputer()
	{
		driver.findElement(computer).click();
	}
	
	public void selectnotebooks()
	{
		driver.findElement(notebooks).click();
	}
	
	public void verifymackbook()
	{
		String expectedname = "Apple MacBook Pro 13-inch";
		String actualname = driver.findElement(mackbook).getText();
		Assert.assertEquals(actualname, expectedname, "Title not match");
		System.out.println("productname is: " + actualname);
		driver.navigate().back();
		driver.navigate().back();
	}
	
	public void selectelectronics()
	{
		driver.findElement(electronics).click();
	}
	
	public void selectcamandphoto()
	{
		driver.findElement(camandphoto).click();
	}
	
	public void verifyappleicam()
	{
		String expectedname = "Apple iCam";
		String actualname = driver.findElement(appleicam).getText();
		Assert.assertEquals(actualname, expectedname, "Title not match");
		System.out.println("productname is: " + actualname);
		driver.navigate().back();
		driver.findElement(logout).click();
	}
	
	

}
