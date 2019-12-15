package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import core.Base;
import pageObjects.LoginPageObject;

public class CanvasLoginPageDefinitions extends Base {
	
	//@Given("^User is on TekSchool page$")
	//public void user_is_on_TekSchool_page() throws Throwable {
	//	System.out.println("This is Canvas Login Page Test");
	//}
	LoginPageObject loginpage;
	@When("^User click on Login button on top of the page$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginpage = new LoginPageObject();
		loginpage.clikOnLoginToClassLink();
		
	}

	@Then("^User should see Canvas Login Page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		loginpage = new LoginPageObject();
		Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
		
	}

}
