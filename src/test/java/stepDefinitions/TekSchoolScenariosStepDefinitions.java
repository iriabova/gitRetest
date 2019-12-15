package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;

import core.Base;
import pageObjects.TekSchoolObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	TekSchoolObject tekSchoolScenariosPageObject=new TekSchoolObject();
	
	
	@When("^User click on my account menu on top of the page$")
	public void user_click_on_my_account_menu_on_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
		//tekSchoolScenariosPageObject.clickonLogin();
		
	}
	
	@And("^User click on register on myAccount$")
	public void user_click_on_register_on_myAccount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickonRegister();    
	}
	
	
//replece 'username' and 'password' with (.+)
	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmaiAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);

		tekSchoolScenariosPageObject.clickOnLOginButton();
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
		Utility.screenshot(driver);

	}
	
	@And("^User click on login on my account menu$")
	public void user_click_on_Login_on_myAccount_menu() {
		tekSchoolScenariosPageObject.clickonLogin();
	}
	

@When("^User click on register on myAccount menu$")
public void user_click_on_register_on_myAccount_menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	tekSchoolScenariosPageObject.clickonRegister();
}

@And("^User fill register form with below information$")
public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	List<List<String>> dataValues = personalInfo.raw();
	
	tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0));
	tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
	tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
	tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
	tekSchoolScenariosPageObject.fillPassword(dataValues.get(0).get(4));
	tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValues.get(0).get(4));
	
	
}

@And("^User click on '(.+)' radio button for Subscribe$")
public void user_click_on_yes_radio_button_for_Subscribe(String radioButtonValue) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
	Utility.screenshot(driver);
}

@And("^User click on continue button$")
public void user_click_on_continue_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	tekSchoolScenariosPageObject.clickOnContinue();
}

@Then("^User should see \"([^\"]*)\"$")
public void user_should_see(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
	Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
}

@When("^User conects to DtaBase$")
public void user_conects_to_DtaBase() throws Throwable {
    DBUtilities.setupConnection();
  
}

@When("^User sends query '(.+)'$")
public void user_sends_query(String query) throws Throwable {
	DBUtilities.runQuery(query) ;  
}

@Then("^User verify account is created with email'(.+)'$")
public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {
  
	
}


	
}
