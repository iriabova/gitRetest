package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MyCases1 extends Base{
	
	public MyCases1() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH, using="//a[text()='Phones & PDAs']")
	private WebElement phoneAndPDAs;
	
	
@FindBy(how=How.XPATH, using="//img[@title='HTC Touch HD']")
private WebElement productButton;


@FindBy(how=How.XPATH, using="//button[text()='Add to Cart']")
private WebElement addToCart;

@FindBy(how=How.XPATH, using="//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessageDisplays;

@FindBy(how=How.XPATH, using="//span[@id='cart-total']")
private WebElement cartItems;


public void clickONphoneAndPDAs() {
	try {
		phoneAndPDAs.click();
	}catch(ElementNotInteractableException e) {
		phoneAndPDAs.sendKeys(Keys.ENTER);
	}
}

public void clickOnproductButton() {
	try {
		productButton.click();
	}catch(ElementNotInteractableException e) {
		productButton.sendKeys(Keys.ENTER);
	}
}
public void clickOnaddToCart() {
	try {
		addToCart.click();
	}catch(ElementNotInteractableException e) {
		addToCart.sendKeys(Keys.ENTER);
	}
}

public boolean verifysuccessMessageDisplays() {
	boolean verificationPoint = successMessageDisplays.isDisplayed();
	return verificationPoint;
}



public void clickOncartItems() {
	try {
		cartItems.click();
	}catch(ElementNotInteractableException e) {
		cartItems.sendKeys(Keys.ENTER);
	}
	
	
}

//
//public void clickAgainSameProduct() {
//	try {
//		addToCart.click();
//	}catch(ElementNotInteractableException e) {
//		addToCart.sendKeys(Keys.ENTER);
//	}
//}
//
//public void clickAddAgainTocartItems() {
//	try {
//		cartItems.click();
//	}catch(ElementNotInteractableException e) {
//		cartItems.sendKeys(Keys.ENTER);
//	}
//	
	
//}


@FindBy(how=How.XPATH, using="//a[@title='Shopping Cart']")
private WebElement shopingCarttButton;

//@FindBy(how=How.XPATH, using="//button[@class='btn btn-danger']//i[@class='fa fa-times-circle']")
//private WebElement theXbutton;

@FindBy(how=How.XPATH, using="//i[@class = 'fa fa-times-circle']")
private WebElement theXbutton;


public void clickOnShoppingCart() {
	try {
		shopingCarttButton.click();
	}catch(ElementNotInteractableException e) {
		shopingCarttButton.sendKeys(Keys.ENTER);
	}
	}

public void clickOnXbutton() {
	try {
		theXbutton.click();
	}catch(ElementNotInteractableException e) {
		theXbutton.sendKeys(Keys.ENTER);
}
}
////////////////////////////////////////////////////////
///////////////////////////////////////////////////////
@FindBy(how=How.XPATH, using="//div[@class='button-group']//button[@data-original-title='Add to Wish List' and@onclick=\"wishlist.add('28');\"]//i[@class=\"fa fa-heart\"]")
private WebElement HeartIconOutsidePage;

@FindBy(how=How.XPATH, using="//div[@class='alert alert-success alert-dismissible']")
private WebElement SuccessMessageOutsidePage;

@FindBy(how=How.XPATH, using="//span[text()='Wish List (1)']")
private WebElement AddToWishlistTopPageButton;

@FindBy(how=How.XPATH, using="//img[@title='HTC Touch HD']")
private WebElement ClickOnProductButton2;

@FindBy(how=How.XPATH, using="//div[@class = 'btn-group']//button[@class = 'btn btn-default']//i[@class = 'fa fa-heart']")
private WebElement HeartIconInsideProductPage;

@FindBy(how=How.XPATH, using="//div[@class='alert alert-success alert-dismissible']")
private WebElement SuccessMessageInsideProductPage;

public void clickOnAddToWishlistButton() {
	try {
		AddToWishlistTopPageButton.click();
	}catch(ElementNotInteractableException e) {
		AddToWishlistTopPageButton.sendKeys(Keys.ENTER);
	}
	}

public void clickOnHeartOutsideButton() {
	try {
		HeartIconOutsidePage.click();
	}catch(ElementNotInteractableException e) {
		HeartIconOutsidePage.sendKeys(Keys.ENTER);
	}
	}
public boolean verifysuccessMessageDisplays2 () {
	boolean verificationPoint = SuccessMessageOutsidePage.isDisplayed();
	return verificationPoint;
}
public void clickOnProductButton() {
	try {
		ClickOnProductButton2.click();
	}catch(ElementNotInteractableException e) {
		ClickOnProductButton2.sendKeys(Keys.ENTER);
	}
	}
public void clickOnHeartIconInsideProductPage() {
	try {
		HeartIconInsideProductPage.click();
	}catch(ElementNotInteractableException e) {
		HeartIconInsideProductPage.sendKeys(Keys.ENTER);
	}
	}
public boolean verifysuccessMessageDisplays3 () {
	boolean verificationPoint = successMessageDisplays.isDisplayed();
	return verificationPoint;
}
//////////////////////////////////////////////////
////////////////////////////////////////////////
@FindBy(how=How.XPATH, using="//a[@class='btn btn-danger']")
private WebElement ClickOnRedXButton;

@FindBy(how=How.XPATH, using="//div[@class='alert alert-success alert-dismissible']")
private WebElement SuccessMessageXButton;


public void clickOnRedXButton() {
	try {
		ClickOnRedXButton.click();
	}catch(ElementNotInteractableException e) {
		ClickOnRedXButton.sendKeys(Keys.ENTER);
	}
	}
public boolean verifysuccessMessageDisplays4 () {
	boolean verificationPoint = SuccessMessageXButton.isDisplayed();
	return verificationPoint;
}
}
