package Sampleletshop;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Mainclass extends Basetest {

	String user = "wolverinek11@rahulshetty.com";
	 String password = "Pwdselenium@1";
	 String url = "https://rahulshettyacademy.com/client";
	 
	 
	 @BeforeTest
	 
		public void openURL() throws InterruptedException {
		 
		 launchBrowser();
		 driver.get(url);
		 Thread.sleep(10000);		 
	 }
	 
	 @Test()

	 public void login() throws InterruptedException {
	
	 Login lp=new Login(driver);
	 Thread.sleep(8000);
	 lp.enterEmail(user);
	 Thread.sleep(5000);
     lp.enterPassword(password);
	 Thread.sleep(5000);
	 lp.clickOnLogin();
	 Thread.sleep(25000);  
	 
 }
	 
	 @Test(dependsOnMethods="login")
	 public void Selectprod() throws InterruptedException
		{
		 Selectprod sp = new Selectprod(driver);
		 sp.addtocart1();
		 Thread.sleep(5000);
		 sp.addtocart2();
		 Thread.sleep(5000);
		}
	 
	 
	 @Test(dependsOnMethods="Selectprod")
	 public void Selectcart() throws InterruptedException
		{
		 Selectcart sc = new Selectcart(driver);
		 sc.opencart();
		 Thread.sleep(5000);
	 
		} 
}
