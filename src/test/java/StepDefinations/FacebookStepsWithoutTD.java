package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepsWithoutTD 
{
	@Given("user is at login page")
	public void user_is_at_login_page()
	{
	    System.out.println("login page");
	}

	@When("user enter correct UN")
	public void user_enter_un() 
	{
	   System.out.println("enter correct UN");
	}

	@When("user enter correct PWD")
	public void user_enter_pwd() 
	{
	    System.out.println("enter correct pwd");
	}

	@When("user click on login btn")
	public void user_click_on_login_btn() 
	{
	    System.out.println("click on login btn");
	}

	@Then("user should be at facebook home page")
	public void user_should_be_at_facebook_home_page()
	{
	   System.out.println("Logged In:- home page");
	}
	
	@When("user enter wrong PWD")
	public void user_enter_wrong_pwd() {
	   System.out.println("enter wrong pwd");
	}
	
	@Then("user should get error msg on login page")
	public void user_should_get_error_msg_on_login_page() {
	    System.out.println("Error msg: login failed");
	}

	

}
