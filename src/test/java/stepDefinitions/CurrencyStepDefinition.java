package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CurrencyObject;


public class CurrencyStepDefinition extends Base{
	CurrencyObject currencyObject =new CurrencyObject();
	
	@When("^User ckics on currensy tap on the lefy top of the page$")
	public void user_ckics_on_currensy_tap_on_the_lefy_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^(\\d+) currensies are displayed$")
	public void currensies_are_displayed(int arg1) throws Throwable {
	   
	}

	@Then("^User can click on different currency$")
	public void user_can_click_on_different_currency() throws Throwable {
	   
	}

	@Then("^choosen currency is displayed under the products$")
	public void choosen_currency_is_displayed_under_the_products() throws Throwable {
	  
	}

	@Then("^user clicks on spesific pruduct$")
	public void user_clicks_on_spesific_pruduct() throws Throwable {
	   
	}

	@Then("^User should see the chosen currency is displayed on the product ditails page$")
	public void user_should_see_the_chosen_currency_is_displayed_on_the_product_ditails_page() throws Throwable {
	   
	}

	@Then("^User clicks on Add to Cart Button$")
	public void user_clicks_on_Add_to_Cart_Button() throws Throwable {
	    
	}

	@Then("^User sees the chesen currensy is displayed$")
	public void user_sees_the_chesen_currensy_is_displayed() throws Throwable {
	    
	}

	@And("^User clicks on my account Button&")
	public void user_clicks_on_my_account_Button()throws Throwable {
	    
	}

	
	@Then("^User clicks on log out Button$")
	public void user_clicks_on_log_out_Button() throws Throwable {
	    
	}

	@Then("^User see the same currency is saved$")
	public void user_see_the_same_currency_is_saved() throws Throwable {
	   
	}


	
}
