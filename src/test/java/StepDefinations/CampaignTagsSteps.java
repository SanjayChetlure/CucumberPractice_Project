package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignTagsSteps 
{
	
	@Given("user is at Campaign page")
	public void user_is_at_campaign_page() 
	{
		System.out.println(" Campaign page");
	}

	@When("user click on create Campaign")
	public void user_click_on_create_campaign()
	{
		System.out.println("clicked on create Campaign");
	}

	@When("user enter info")
	public void user_enter_info() 
	{
		System.out.println("user entered info");
	}

	@Then("status of Campaign should get draft")
	public void status_of_campaign_should_get_draft()
	{
		System.out.println("Campaign get drafted");
	}

	@When("user click on edit Campaign")
	public void user_click_on_edit_campaign() 
	{
		System.out.println("click on edit Campaign");
	}

	@When("enter the date and time")
	public void enter_the_date_and_time() 
	{
		System.out.println("entered the date and time");
	}

	@Then("status of Campaign should get scheduled")
	public void status_of_campaign_should_get_scheduled()
	{
		System.out.println("Campaign get scheduled");
	}

	@When("user click on active btn")
	public void user_click_on_active_btn() 
	{
		System.out.println("click on active btn");
	}

	@Then("status of Campaign should get sent")
	public void status_of_campaign_should_get_sent() 
	{
		System.out.println("Campaign get sent");
	}


}
