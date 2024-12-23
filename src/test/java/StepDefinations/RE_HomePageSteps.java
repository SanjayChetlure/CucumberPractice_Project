package StepDefinations;

import java.io.IOException;

import org.testng.Assert;

import Pages.MagentoHomePage;
import QA.DriverFactory;
import Utility.configLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RE_HomePageSteps 
{
	MagentoHomePage home=new MagentoHomePage(DriverFactory.driver);
	
	@Given("I am at home page")
	public void i_am_at_home_page() throws IOException
	{
	   DriverFactory.driver.get(configLoader.readPFData("URL") );
	}

	@Then("page title should have {string}")
	public void page_title_should_have(String expTitle) 
	{
	    Assert.assertEquals(home.getTitle(), expTitle," Failed: wrong title found");
	}

	@Then("I should see signIn link on page")
	public void i_should_see_sign_in_link_on_page()
	{
		Assert.assertTrue(home.isLinkDisplayed()," Failed: link not found");
	}

	@When("I search for text {string}")
	public void i_search_for_text(String text) throws InterruptedException 
	{
		home.searchText(text);
		Thread.sleep(2000);
		home.clickSearchIcon();
	}

	@Then("I should navigate to result page")
	public void i_should_navigate_to_result_page()
	{
	Assert.assertTrue(home.getProductList()>1,"Failed: product list not found");
	}


}
