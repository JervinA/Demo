package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import letsshop.Mainfile;

public class Login {
	
	Mainfile mf = new Mainfile();
	
	
	@Given("when application is loaded #precondition")
	public void when_application_is_loaded_precondition() {
	//    mf.openURL();
	}

	@When("user enters the username #step")
	public void user_enters_the_username_step() throws InterruptedException  {
		mf.login();
	   
	}

	@When("user enters the password")
	public void user_enters_the_password() {
	    
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	    
	}


	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("verify home page loaded #validation")
	public void verify_home_page_loaded_validation() {
	   
	}


}
