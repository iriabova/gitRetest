Feature: Tek School Scenarios

Background: 
Given User is on TekSchool page
And User Click on Test Environment link
And User should see Test Environment page

@SDET_003
Scenario: SDET2019AUG_SDET_003_Execution
When User click on my account menu on top of the page
And User click on login on my account menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be logged in


@SDET_003_SO
Scenario Outline: SDET2019AUG_SDET_003_Execution with multiple user and password

When User click on my account menu on top of the page
And User click on register on myAccount
And User enter username '<username>' and password '<password>' in returning menu
And User click on login button
Then User should be logged in
#Then user DOB <dateofBirth> just add colomns in axamples
Examples:
|username|password|
|teststudent1@gmail.com|Tek@Test.com|
|tekschool0011@gmail.com|testtest|
|testdata1@gmail.com|testdata|

@SDET_RF
Scenario: SDET2019AUG_SDET_Register_Form_Test
When User click on my account menu on top of the page
And User click on register on myAccount menu
And User fill register form with below information
#firstname|lastname|email|phone|password|
|Julia|Darwish|juliawh1@gmail.com|2021234422| Test123|
And User click on 'yes' radio button for Subscribe
And User click on continue button
Then User should see "Your Account Has Been Created!"




# And User fill'firstname' ''lastname' 'telephone' 'email' 'password'
#And User fill the personal info section with below data
#|name|lastname|phone|email|password|passwordConfirmation|
#|student|tekschool|8768899988|tek@gmail..com|123|123|
#|student2|tekschool|8768899988|tek2@gmail..com|1234|123|
#|student3|tekschool|8768899988|tek3@gmail..com|1235|123|
#|student4|tekschool|8768899988|tek4@gmail..com|1236|123|

#what is the difference between Scenario outline and DataTable?
# Scenario outline runs entire scenario based on rows in examoles keyword 

#Datatables runs only that specifiec step in a scenario


@SDET_RF_DBV
Scenario: SDET2019AUG_SDET_Register_Form_Test
When User click on my account menu on top of the page
And User click on register on myAccount menu
And User fill register form with below information
#firstname|lastname|email|phone|password|
|Julia|Darwish|sharon.robinson@sakilacustomer.org |2021234422| Test123|
And User click on 'yes' radio button for Subscribe
And User click on continue button
Then User should see "Your Account Has Been Created!"
When User conects to DtaBase
And User sends query 'select * from public.customer where email='sharon.robinson@sakilacustomer.org ''
Then User verify account is created with email'sharon.robinson@sakilacustomer.org '


