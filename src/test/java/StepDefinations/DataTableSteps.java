package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataTableSteps
{
	
	@Given("user should be at bank acc login page")
	public void user_should_be_at_bank_acc_login_page() 
	{
	    System.out.println("login page");
	}

	@When("user enter following data")
	public void user_enter_following_data(DataTable DT)
	{
		System.out.println("get DataTable info");
		List<List<String>> data = DT.asLists();
		List<String> row = data.get(0);
		String value = row.get(0);
		System.out.println("Index 0,0 info:- "+value);
	}
	

	@When("user click on submit btn")
	public void user_click_on_submit_btn()
	{
	    System.out.println("click on submit btn");
	}

	@Then("user get created")
	public void user_get_created()
	{
	   System.out.println("user get created");
	}
	
	
	@When("user enter following data using map")
	public void user_enter_following_data_using_map(DataTable DT) 
	{
	List<Map<String, String>> data = DT.asMaps();
		String info = data.get(0).get("FN");
		System.out.println(info);
	}
	
	
	
	

}
