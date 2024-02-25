package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Registerfile extends Basetest {
	
	public Registerfile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By login=By.xpath("//a[@class='ico-login']");
	By register=By.xpath("//button[@class='button-1 register-button']");
	By male=By.xpath("//input[@id='gender-male']");
	By firstname=By.xpath("//input[@id='FirstName']");
	By lastname=By.xpath("//input[@id='LastName']");
	By email=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By conpassword=By.xpath("//input[@id='ConfirmPassword']");
	By submit=By.xpath("//button[@id='register-button']");

	
	
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	
	public void selectregister()
	{
		driver.findElement(register).click();
	}
	
	public void selectmale()
	{
		driver.findElement(male).click();
	}
	
	public void enterfirstname()
	{
		driver.findElement(firstname).sendKeys("Jervin");
	}
	
	public void enterlastname()
	{
		driver.findElement(lastname).sendKeys("C");
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,300)","" );
	}
	
	public void entermail()
	{
		driver.findElement(email).sendKeys("jervinit120@gmail.com");
	}
	
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("Jeran11@");
	}
	
	public void enterconpassword()
	{
		driver.findElement(conpassword).sendKeys("Jeran11@");
	}
	
	public void clickregisterbutton()
	{
		driver.findElement(submit).click();
	}
	

}
