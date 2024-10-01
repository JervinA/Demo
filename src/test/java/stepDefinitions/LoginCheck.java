package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCheck {
	
WebDriver driver = null;
	
	@Given("browser is opening")
	public void browser_is_opening() {
		
		System.out.println("Inside step - Browser is opening");	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	
	@And("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		System.out.println("Inside step - Login page is open");
		
		driver.navigate().to("https://rahulshettyacademy.com/client");   
		Thread.sleep(5000);
	    
	}

	@When("^user enters a (.*) and (.*)$")
	public void user_enters_a_jervin112001_gmail_com_and_jeran11(String username, String password) {
		
		System.out.println("Inside step - Usrname and password page is open");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(password);
	    
	}
	
	@And("clicks enter")
	public void clicks_enter() throws InterruptedException {
		
		System.out.println("Inside step - user clicks enter");
		
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		System.out.println("Inside step - user is on home page");
		//driver.close();
	    
	}


}
