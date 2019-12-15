Feature: Tek School Scenarios2

Background: 
Given User is on TekSchool page
And User Click on Test Environment link
And User should see Test Environment page


#Scenario: SDET2019AUG_SDET_003_Execution
When User click on my account menu on top of the page
And User click on login on my account menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be logged in

@SDET_007
Scenario:SDET_07_When_user_verify_"Wish_list"
When User clicks on button phones&PDAs

And User clicks on the HeartIcon
Then User should see the message Success: You have added HTC Touch HD to your wish list!
Then verify item was added on WishList on the top of the menu
When User clicks on the image of the product
And User clicks on the HeartIcon1
#Then User should see the message Success: You have added HTC Touch HD to your wish list!
And User can clicks on on the Wish List menu on the top
Then User should see Wish List Page

And User clicks on RedXButton
Then Item should be removed and user should see Success: You have modified your wish list!