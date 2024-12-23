package StepDefinations;

import org.testng.Assert;

import Pages.ProductPage;
import QA.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RE2_ProductPageSteps
{	
	ProductPage pp=new ProductPage(DriverFactory.getDriver());
	
	@When("I click on Men")
	public void i_click_on_Men()
	{
		pp.clickOnSection();
	}

	@Then("I should redirect to section")
	public void i_should_redirect_to_section() 
	{
		boolean actResult = pp.verifySection();
		Assert.assertTrue(actResult, "Failed: section not found");
	}

	@When("I Select product")
	public void i_select_product() 
	{
		pp.clickOnProduct();
	}

	@Then("Product page should display")
	public void product_page_should_display() 
	{
		boolean actResult = pp.verifyProductPage();
		Assert.assertTrue(actResult, "Failed: Product page not found");
	}

	@When("I select size & colour")
	public void i_select_size_colour() 
	{
		pp.selectSizeAndColour();
	}

	@When("click on add to cart")
	public void click_on_add_to_cart()
	{
		pp.clickOnAddToCart();
	}

	@Then("I should See product added confirmation msg ad {string}")
	public void i_should_see_product_added_confirmation(String expMsg) 
	{
		String actMsg = pp.getMsg();
		Assert.assertTrue(actMsg.contains(expMsg),"Failed: both msg are diff");
	}
	

}
