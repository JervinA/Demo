package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Nokialumina extends Basetest {
	
	public Nokialumina(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	By electronics=By.xpath("(//a[@title='Show products in category Electronics'])[1]");
	By cellphones=By.xpath("(//a[@title='Show products in category Cell phones'])[1]");
	By addtocart=By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[3]");
	By shoppingcart=By.xpath("//span[@class='cart-label']");
	By checkbox=By.xpath("//input[@id='termsofservice']");
	By checkout=By.xpath("//button[@id='checkout']");
	By delete=By.xpath("//button[@id='delete-billing-address-button']");
	By guest=By.xpath("//button[@class='button-1 checkout-as-guest-button']");
	By firstname=By.xpath("//input[@id='BillingNewAddress_FirstName']");
	By lastname=By.xpath("//input[@id='BillingNewAddress_LastName']");
	By email=By.xpath("//input[@id='BillingNewAddress_Email']");
	By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
	By city=By.xpath("//input[@id='BillingNewAddress_City']");
	By address1=By.xpath("//input[@id='BillingNewAddress_Address1']");
	By postalcode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
	By phnumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
	By continuebutton1=By.xpath("(//button[@type='button'])[5]");
	By continuebutton2=By.xpath("(//button[@type='button'])[10]");
	By continuebutton3=By.xpath("(//button[@type='button'])[11]");
	By continuebutton4=By.xpath("(//button[@type='button'])[12]");
	By confirm=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	public void selectelectronics()
	{
		driver.findElement(electronics).click();
	}
	
	public void selectcellphones()
	{
		driver.findElement(cellphones).click();
	}
	
	public void selectaddtocart()
	{
		driver.findElement(addtocart).click();
	}
	
	public void selectshoppingcart()
	{
		driver.findElement(shoppingcart).click();
	}
	
	public void selectcheckbox()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		jsss.executeScript("window.scrollBy(0,400)","" );
		driver.findElement(checkbox).click();
	}
	
	public void selectcheckout()
	{
		driver.findElement(checkout).click();
		
	}
	
/*	public void selectguest()
	{
		driver.findElement(guest).click();
	}  */
	
	public void enterFirstname() throws InterruptedException
	{
		try {
		if(!driver.findElements(firstname).isEmpty())
		{
			driver.findElement(firstname).sendKeys("Jervin");
		}
		else {
			Thread.sleep(5000);
			driver.findElement(delete).click();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		driver.findElement(firstname).clear();
	//	driver.findElement(firstname).sendKeys("Jervin");
	}
	
	public void enterlastname()
	{
		driver.findElement(firstname).sendKeys("Jervin");
		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys("c");
	}
	
	public void entermail()
	{
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("jervinit120@gmail.com");
	}
	
	public void selectcountry()
	{
		
	
		driver.findElement(country).click();
		Select filesselection=new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
		filesselection.selectByIndex(193);
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		 jss.executeScript("window.scrollBy(0,300)","" );
	}
	
	public void entercity()
	{
		driver.findElement(city).sendKeys("Coimbatore");
	}
	
	public void enteraddress()
	{
		driver.findElement(address1).sendKeys("townhall");
	}
	
	public void enterpostalcode()
	{
		driver.findElement(postalcode).sendKeys("641041");
	}
	
	public void enternumber()
	{
		driver.findElement(phnumber).sendKeys("6380886760");
	}
	
	public void selectcontinuebutton1()
	{
		driver.findElement(continuebutton1).click();
	}
	
	public void selectcontinuebutton2()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,200)","" );
		driver.findElement(continuebutton2).click();
	}
	
	public void selectcontinuebutton3()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,200)","" );
		driver.findElement(continuebutton3).click();
	}
	
	public void selectcontinuebutton4()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,200)","" );
		driver.findElement(continuebutton4).click();
	}
	
	public void selectconfirm()
	{
		JavascriptExecutor jsss=(JavascriptExecutor)driver;
		 jsss.executeScript("window.scrollBy(0,300)","" );
		driver.findElement(confirm).click();
	}
	
	public void selectlogout()
	{
		driver.findElement(logout).click();
	}

}
