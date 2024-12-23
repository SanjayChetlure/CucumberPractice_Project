package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazoneSteps
{
	@Given("user is on Amzone login page")
	public void user_is_on_amzone_login_page() 
	{
	    System.out.println("Login page");
	}

	@When("user enter Username as {string}")
	public void user_enter_username_as(String username)
	{
	    System.out.println("Enter Username:- "+username);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) 
	{
	    System.out.println("Enter pwd:- "+password);
	}

	@When("user enter pin as {int}")
	public void user_enter_pin_as(Integer pin) 
	{
	  System.out.println("Enter pin:- "+pin);
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
	    System.out.println("click on login btn");
	}

	@Then("Amazone app should be loged in.")
	public void amazone_app_should_be_loged_in() 
	{
	    System.out.println("Amazone app logged in");
	}

	@When("user search product")
	public void user_search_product() 
	{
	    System.out.println("search product");
	}

	@When("user added product to Cart")
	public void user_added_product_to_cart() 
	{
	    System.out.println("product added to cart");
	}

	@When("user paid amount")
	public void user_paid_amount()
	{
	  System.out.println("Amount paid");
	}

	@Then("order confirmed msg should display")
	public void order_confirmed_msg_should_display() 
	{
		System.out.println("Msg: order confirmed");
	}

	@When("user click on logout Button")
	public void user_click_on_logout_button() {
	   System.out.println("click on logout Button");
	}

	@Then("Amazone app should be loged out")
	public void amazone_app_shoild_be_loged_out() 
	{
	System.out.println("Amazone app loged out");
	}

}
