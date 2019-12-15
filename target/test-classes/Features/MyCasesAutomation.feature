Feature:  My cases Automation

Background: 
Given User is on TekSchool page
And User Click on Test Environment link
And User should see Test Environment page

@SDET_005
Scenario: SDET2019AUG_SDET_005_Execution
When User clicks on button phones&PDAs
And User clicks on the product

Then User clicks on Add to cart button
Then User should see Success:You have added product to your shoping cart!
When User clicks on Shopping Cart
Then User sees a list of shoping items
#When User clicks on the same product again
And User clicks on Add to cart button
Then quantaty of product should be encreased

#@SDET_006
#Scenario: SDET2019AUG_SDET_006_Execution
When User click on “Shopping Cart” menu
And User click on the X button
Then shoping cart is empty