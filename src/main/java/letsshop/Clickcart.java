package letsshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Clickcart {
	
	WebDriver driver;

	 public Clickcart(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	// By Cart=By.xpath("/html/body/app-root/app-dashboard/app-");
	 By Cart=By.xpath("/html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]/button");
	 
	 public void opencart()
	 {
	 driver.findElement(Cart).click();
	 }

}
