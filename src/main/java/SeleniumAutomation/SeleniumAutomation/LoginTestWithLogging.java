package SeleniumAutomation.SeleniumAutomation;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//public class Samplelog {
	
	public class LoginTestWithLogging {
		
		
	    private static final Logger logger = LogManager.getLogger(LoginTestWithLogging.class);
	    @Test
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to the chromedriver executable
	    	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");

	        // Create an instance of Chrome WebDriver
	    	WebDriver driver = new EdgeDriver();

	        // Open the website
	        logger.info("Opening website...");
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	        
	        Thread.sleep(10000);

	        // Find username and password fields and enter credentials
	        logger.info("Searching Cucumber...");
	        WebElement searchbar=driver.findElement(By.className("search-keyword"));
	        searchbar.sendKeys("cucumber");
	        Thread.sleep(5000);

	        logger.info("Cucumber click...");
	        WebElement cucumber=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]"));
			cucumber.click();
			Thread.sleep(3000);

	        // Click on the login button
	        logger.info("Clicking on cart button...");
	        WebElement cart=driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img"));
			cart.click();
			Thread.sleep(3000);

	        // Add a delay to allow time for the page to load
	        try {
	            Thread.sleep(3000); // 3 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Verify successful login
/*	        if (driver.getTitle().contains("Home Page")) {
	            logger.info("Login successful!");
	        } else {
	            logger.error("Login failed.");
	        }   */

	        // Close the browser
	        logger.info("Closing the browser...");
	        driver.quit();
	    }

}
