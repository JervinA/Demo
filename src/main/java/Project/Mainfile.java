package Project;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import SeleniumAutomation.SeleniumAutomation.Basetest;

public class Mainfile extends Basetest {
	
	
	
	
	String username ="jervinit120@gmail.com";
	String password ="Jeran11@";
	String url = "https://demo.nopcommerce.com/";
	
	@BeforeTest
	
	public void openURL() {
		launchBrowser();
		driver.get(url);
	}	

	
	@Test()
	
	public void login() throws InterruptedException {
		
		Loginfile lf = new Loginfile(driver);
		lf.selectLogin();
		Thread.sleep(5000);
		lf.enterEmail(username);
		Thread.sleep(5000);
		lf.enterPassword(password);
		Thread.sleep(5000);
		lf.clickOnLogin();
		Thread.sleep(5000);
		lf.clickverifylogin();
	}     
	
	
/*	@Test()
	
	public void register() throws InterruptedException
	{
		Registerfile rf = new Registerfile(driver);
		rf.clicklogin();
		Thread.sleep(5000);
		rf.selectregister();
		Thread.sleep(5000);
		rf.selectmale();
		Thread.sleep(5000);
		rf.enterfirstname();
		Thread.sleep(5000);
		rf.enterlastname();
		Thread.sleep(5000);
		rf.entermail();
		Thread.sleep(5000);
		rf.enterpassword();
		Thread.sleep(5000);
		rf.enterconpassword();
		Thread.sleep(5000);
		rf.clickregisterbutton();
		
	}    */
	
/*	@Test(dependsOnMethods="login")
	
	public void appleicam() throws InterruptedException
	{
		Appleicam ai = new Appleicam(driver);
		ai.selectelectronics();
		Thread.sleep(7000);
		ai.selectcamera();
		Thread.sleep(7000);
		ai.selectnikkoncart();
		Thread.sleep(7000);
		ai.selectaddtocart();
		Thread.sleep(7000);
		ai.selectshoppingcart();
		Thread.sleep(7000);
		ai.tocheckcart();
		Thread.sleep(7000);
		ai.clicklogout();		
	}  */
	
/*	@Test(dependsOnMethods="login")
	
	public void nokialumina() throws InterruptedException
	{
		Nokialumina nl = new Nokialumina(driver);
		nl.selectelectronics();
		Thread.sleep(5000);
		nl.selectcellphones();
		Thread.sleep(5000);
		nl.selectaddtocart();
		Thread.sleep(5000);
		nl.selectshoppingcart();
		Thread.sleep(5000);
		nl.selectcheckbox();
		Thread.sleep(5000);
		nl.selectcheckout();
		Thread.sleep(5000);
//		nl.selectguest();
//		Thread.sleep(5000);
		nl.enterFirstname();
		Thread.sleep(3000);
		nl.enterlastname();
		Thread.sleep(3000);
		nl.entermail();
		Thread.sleep(3000);
		nl.selectcountry();
		Thread.sleep(3000);
		nl.entercity();
		Thread.sleep(3000);
		nl.enteraddress();
		Thread.sleep(3000);
		nl.enterpostalcode();
		Thread.sleep(3000);
		nl.enternumber();
		Thread.sleep(3000);
		nl.selectcontinuebutton1();
		Thread.sleep(5000);
		nl.selectcontinuebutton2();
		Thread.sleep(5000);
		nl.selectcontinuebutton3();
		Thread.sleep(5000);
		nl.selectcontinuebutton4();
		Thread.sleep(5000);
		nl.selectconfirm();
		Thread.sleep(5000);
		nl.selectlogout();
		
		
		
	}     */
	
	
/*	@Test(dependsOnMethods="login")
	
	public void Orderdetails() throws InterruptedException
	{
		Orderdetails od = new Orderdetails(driver);
		od.selectorders();
		Thread.sleep(5000);
		od.selectdetails();
		Thread.sleep(5000);
		od.selectlogout();
	}  */
	
/*	@Test(dependsOnMethods="login")
	
	public void Hpspectre() throws InterruptedException
	{
		Hpspectre hs = new Hpspectre(driver);
		hs.entersearch();
		Thread.sleep(5000);
		hs.selectsearch();
		Thread.sleep(5000);
		hs.clickverify();
		Thread.sleep(5000);
		hs.selectlogout();
	}    */
	
/*	@Test(dependsOnMethods="login")
	
	public void Newaddress() throws InterruptedException
	{
		Newaddress ad = new Newaddress(driver);
		ad.selectmyaccount();
		Thread.sleep(5000);
		ad.selectaddress();
		Thread.sleep(5000);
		ad.selectaddnew();
		Thread.sleep(5000);
		ad.enterfirstname();
		Thread.sleep(5000);
		ad.enterlastname();
		Thread.sleep(5000);
		ad.enteremail();
		Thread.sleep(5000);
		ad.selectcountry();
		Thread.sleep(5000);
		ad.entercity();
		Thread.sleep(5000);
		ad.enteraddress1();
		Thread.sleep(5000);
		ad.enterpostalcode();
		Thread.sleep(5000);
		ad.enterphnumber();
		Thread.sleep(5000);
		ad.clicksave();
		Thread.sleep(5000);
		ad.verification();
		Thread.sleep(5000);
		ad.deletion();
		Thread.sleep(5000);
		
		
		
	}   */
	
/*	@Test(dependsOnMethods="login")
	
	public void Listproducts() throws InterruptedException
	{
		Listproducts lp= new Listproducts(driver);
		lp.selectcomputer();
		Thread.sleep(5000);
		lp.selectnotebooks();
		Thread.sleep(5000);
		lp.verifymackbook();
		Thread.sleep(5000);
		lp.selectelectronics();
		Thread.sleep(5000);
		lp.selectcamandphoto();
		Thread.sleep(5000);
		lp.verifyappleicam();
		Thread.sleep(5000);
	}    */
	
	@Test(dependsOnMethods="login")
	
	public void Elegantscreenshot() throws InterruptedException, IOException
	{
		Elegantscreenshot es = new Elegantscreenshot(driver);
		es.entersearch();
		Thread.sleep(5000);
		es.clicksearchbutton();
		Thread.sleep(5000);
		
		
	}

}
