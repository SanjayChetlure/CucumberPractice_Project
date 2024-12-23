package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps 
{
	@Given("user enter username {string}")
	public void user_enter_username(String username) 
	{
		System.out.println("entered username:- "+username);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password)
	{
		System.out.println("Entered password:- "+password);
	}

	@When("user enter PIN {int}")
	public void user_enter_pin(Integer pin)
	{
		System.out.println("Entered pin:- "+pin);
	}

	@When("user click on login BTN")
	public void user_click_on_login_btn() 
	{
		System.out.println("click on login btn");
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() 
	{
		System.out.println("App logged In");
	}
	
	
	@Given("user enter url of app")
	public void user_enter_url_of_app() 
	{
		System.out.println("Url entered");
	}

	@Then("title should display")
	public void title_should_display() 
	{
		System.out.println("Title found");
	}
	
	@When("user enter mobileNumber as {int}")
	public void user_enter_mobile_number_as(Integer MobNum) 
	{
	    System.out.println("Enter MobNum:- "+MobNum);
	}
		

	@When("user enter FN {string}")
	public void user_enter_fn(String FN) 
	{
		System.out.println("Enter FN:- "+FN);
	}

	@When("user enter LN {string}")
	public void user_enter_ln(String LN)
	{
	    System.out.println("Enter LN:- "+LN);
	}

	@When("user click on create user btn")
	public void user_click_on_create_user_btn()
	{
	    System.out.println("click on create user btn");
	}

	@Then("user should be created")
	public void user_should_be_created() {
	    System.out.println("user created");
	}

	@When("user click on delete user btn")
	public void user_click_on_delete_user_btn() 
	{
	    System.out.println("click on delete user btn");
	}

	@Then("user should be deleted")
	public void user_should_be_deleted() 
	{
	    System.out.println("user  deleted");
	}
	
	

}
