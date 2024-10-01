package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside step - Browser is open");	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	
	@And("User is on google page")
	public void user_is_on_google_page() throws InterruptedException {
		
		System.out.println("Inside step - user is on browser page");
		
		driver.navigate().to("https://www.google.com/");   
		Thread.sleep(5000);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		
		System.out.println("Inside step - User enters text");
		
		driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
		
		Thread.sleep(5000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		System.out.println("Inside step - user clicks enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	    
		System.out.println("Inside step - user is on search result page");
		
		driver.getPageSource().contains("Online Courses");
				
	}


}
