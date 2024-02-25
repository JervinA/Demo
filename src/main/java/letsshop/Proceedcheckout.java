package letsshop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Proceedcheckout {
	
	WebDriver driver;

	 public Proceedcheckout(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 By Checkout=By.xpath("/html/body/app-root/app-profile/div/div[3]/ul/li[3]/button");
	 
	 public void scrolldown()
	  {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)","" );
	  }
	  
	  
	  public void proceedcheckout()
		 {
		 driver.findElement(Checkout).click();
		}
	  
	  public void scrollup()
	  {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-300)","" );
	  }

}
