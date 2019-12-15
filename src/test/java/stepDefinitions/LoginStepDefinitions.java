package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;
import utilities.Utility;

public class LoginStepDefinitions extends Base{

	//Declare LoginPageObject obj
	
	LoginPageObject loginpage;
	
	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() throws Throwable {
		Base.initializeDriver();
		
		//check for title of the Tek School page
		loginpage = new LoginPageObject();
		String expectedTitle = "TEK School – Knowledge is power";
		//This is hard Assertion and if expected does not meet actual result it will fail the execution
		Assert.assertEquals(expectedTitle, loginpage.pageTitle());
		
	}

	@When("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();
	}

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		
		Assert.assertEquals("TEK SCHOOL", driver.getTitle());
	
	}

}
