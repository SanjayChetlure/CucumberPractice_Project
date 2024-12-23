package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepsWithTD 
{
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("login page");
	}

	@When("user enter UN as {string}")
	public void user_enter_un_as(String username) 
	{
		System.out.println("Enter username :-"+username);
	}

	@When("user enter PWD as {string}")
	public void user_enter_pwd_as(String password)
	{
		System.out.println("Enter password:- "+password);
	}
	
	
	@When("user enter pin {int}")
	public void user_enter_pin(Integer pin)
	{
		System.out.println("Enter Pin:- "+pin);
	}

	@When("user clicks on login btn")
	public void user_clicks_on_login_btn()
	{
		System.out.println("clicks on login btn");
	}

	@Then("Home page should display")
	public void home_page_should_display() 
	{
		System.out.println("Home page found");
	}

}
