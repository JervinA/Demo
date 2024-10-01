package SeleniumAutomation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {

/*	private WebDriver driver;
	private GenericTry GenericRun;
	
	@BeforeClass()
	
	public void setUp() {
		System.setProperty("webDriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		GenericRun = new GenericTry(driver);
	}
	
	@Test()
	
	public void testLogin() {
		GenericRun.click("null");
		
	}
}  */
	
	public static void main(String[] args) {
        // Set up WebDriverManager to automatically manage driver binaries
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to a website
            driver.get("https://www.google.com/");

            // Find the search box (example, modify as needed)
       /*     WebElement searchBox = driver.findElement(By.name("q")); // Change selector as needed
            searchBox.sendKeys("Selenium WebDriver");

            // Submit the search
            searchBox.submit();*/

            // Wait for a few seconds to see the results (for demonstration purposes)
            Thread.sleep(3000); // Replace with explicit waits in production code

            // Print the title of the page
          //  System.out.println("Page title is: " + driver.getTitle());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
