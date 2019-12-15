package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MyCases1;
import utilities.Utility;

public class MyCasesAutomation extends Base {
	
	MyCases1 addToShopingCart =new MyCases1();
	MyCases1 addToWishList = new MyCases1();
	
	@When("^User clicks on button phones&PDAs$")
	public void user_clicks_on_button_phones_PDAs() throws Throwable {
		addToShopingCart.clickONphoneAndPDAs();
	}

	@And("^User clicks on the product$")
	public void user_clicks_on_the_product() throws Throwable {
		addToShopingCart.clickOnproductButton();
	}

	

	@Then("^User clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
		addToShopingCart.clickOnaddToCart();
	}

	@Then("^User should see Success:You have added product to your shoping cart!$")
	public void user_should_see_Success_You_have_added_product_to_your_shoping_cart() throws Throwable {
		Assert.assertEquals(addToShopingCart.verifysuccessMessageDisplays(),true);
		Utility.screenshot(driver);
	}

	@When("^User clicks on Shopping Cart$")
	public void user_clicks_on_Shopping_Cart() throws Throwable {
		addToShopingCart.clickOncartItems();

	}

	@Then("^User sees a list of shoping items$")
	public void user_sees_a_list_of_shoping_items() throws Throwable {
		Utility.screenshot(driver);

	}

//	@When("^User clicks on the same product$")
//	public void user_clicks_on_the_same_product() throws Throwable {
//		addToShopingCart.clickAgainSameProduct();
//	}
//		@And("^User clicks on Add to cart button$")
//		public void user_clicks_Add_to_cart_button() throws Throwable {
//			addToShopingCart.clickAddAgainTocartItems();
//		
//	}

	@Then("^quantaty of product should be encreased$")
	public void quantaty_of_product_should_be_encreased() throws Throwable {
		Utility.screenshot(driver);

	}
//////////////////////////////////////////////////////////
	@When("^User click on “Shopping Cart” menu$")
	public void user_click_on_Shopping_Cart_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addToShopingCart.clickOnShoppingCart();
	}

	@And("^User click on the X button$")
	public void user_click_on_the_X_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addToShopingCart.clickOnXbutton();
	}

	@Then("^shoping cart is empty$")
	public void shoping_cart_is_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
	}
	//////////////////////////////////////////////////////
	/////////////////////////////////////////////////////

@When("^User clicks on the HeartIcon$")
public void user_clicks_on_the_HeartIcon() throws Throwable {
	addToWishList.clickOnHeartOutsideButton() ;
}

@Then("^User should see the message Success: You have added HTC Touch HD to your wish list!$")
public void user_should_see_the_message_Success_You_have_added_HTC_Touch_HD_to_your_wish_list() throws Throwable {
	Assert.assertEquals(addToWishList.verifysuccessMessageDisplays2(),true);
	Utility.screenshot(driver);
	
}

@Then("^verify item was added on WishList on the top of the menu$")
public void verify_item_was_added_on_WishList_on_the_top_of_the_menu() throws Throwable {
	Utility.screenshot(driver);
	
}

@When("^User clicks on the image of the product$")
public void user_clicks_on_the_image_of_the_product() throws Throwable {
	addToWishList.clickOnproductButton();
	
}

@And("^User clicks on the HeartIcon1$")
public void user_clicks_on_the_HeartIcon1() throws Throwable {
	addToWishList.clickOnHeartIconInsideProductPage();
	
}



@Then("^User can clicks on on the Wish List menu on the top$")
public void user_can_clicks_on_on_the_Wish_List_menu_on_the_top() throws Throwable {
	addToWishList.clickOnAddToWishlistButton();
	
}

@Then("^User should see Wish List Page$")
public void user_should_see_Wish_List_Page() throws Throwable { 
	System.out.println(driver.getTitle());
	 Utility.screenshot(driver);
}
///////////////////////////////////////////////////
///////////////////////////////////////////////////
@Then("^User clicks on RedXButton$")
public void user_clicks_on_RedXButton() throws Throwable {
	addToWishList.clickOnRedXButton() ;
}

@Then("^Item should be removed and user should see Success: You have modified your wish list!$")
public void item_should_be_removed_and_user_should_see_Success_You_have_modified_your_wish_list() throws Throwable {
	Assert.assertEquals(addToWishList.verifysuccessMessageDisplays4 () ,true);
	Utility.screenshot(driver);
}
	
	
}
