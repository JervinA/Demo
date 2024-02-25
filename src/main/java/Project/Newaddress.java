package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Newaddress extends Basetest {
	
	public Newaddress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	By myaccount=By.xpath("//a[@class='ico-account']");
	By address=By.partialLinkText("Addresses");
	By addnew=By.xpath("//button[@class='button-1 add-address-button']");
	By firstname=By.xpath("//input[@id='Address_FirstName']");
	By lastname=By.xpath("//input[@id='Address_LastName']");
	By email=By.xpath("//input[@id='Address_Email']");
	By country=By.xpath("//select[@id='Address_CountryId']");
	By city=By.xpath("//input[@id='Address_City']");
	By address1=By.xpath("//input[@id='Address_Address1']");
	By postalcode=By.xpath("//input[@id='Address_ZipPostalCode']");
	By phnumber=By.xpath("//input[@id='Address_PhoneNumber']");
	By save=By.xpath("//button[@class='button-1 save-address-button']");
	By verify=By.xpath("//button[@class='button-2 delete-address-button']");
	
	
	public void selectmyaccount()
	{
		driver.findElement(myaccount).click();
	}
	
	public void selectaddress()
	{
		driver.findElement(address).click();
	}
	
	public void selectaddnew()
	{
		driver.findElement(addnew).click();
	}
	
	public void enterfirstname()
	{
		driver.findElement(firstname).sendKeys("teddy");
	}
	
	public void enterlastname()
	{
		driver.findElement(lastname).sendKeys("C");
	}
	
	public void enteremail()
	{
		driver.findElement(email).sendKeys("abc@gmail.com");
	}
	
	public void selectcountry()
	{
		driver.findElement(country).click();
		driver.findElement(country).sendKeys("India");
/*		Select filesselection=new Select(driver.findElement(By.xpath("//select[@id='Address_CountryId']")));
		filesselection.selectByValue("India");   */
	}
	
	public void entercity()
	{
		driver.findElement(city).sendKeys("chennai");
	}
	
	public void enteraddress1()
	{
		driver.findElement(address1).sendKeys("abc street");
	}
	
	public void enterpostalcode()
	{
		driver.findElement(postalcode).sendKeys("808080");
	}
	
	public void enterphnumber()
	{
		driver.findElement(phnumber).sendKeys("1234567890");
	}
	
	public void clicksave()
	{
		driver.findElement(save).click();
	}
	
	public void verification()
	{
		String expectedname = "Delete";
		String actualname = driver.findElement(verify).getText();
		Assert.assertEquals(actualname, expectedname, "Title not match");
	}
	
	public void deletion()
	{
		driver.findElement(verify).click();
		driver.switchTo().alert().accept();
	}
	
	
	
	
}
