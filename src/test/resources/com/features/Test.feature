Feature: Login Page feature1

Scenario: Login Page Title1
Given user is on login page
When User gets the title of the Page
Then Page title should be " Login - My Store"

Scenario: Forgot Password Link1
Given user is on login page
Then Forgot Password link should be displayed

Scenario: Login With correct credentials1
Given user is on login page
When User Enter UserName "Arunpandey2784@gmail.com1"
And user Enter Password "Arun27841$"
And user clicks on Login Button1
When User gets the title of the Page
And Page title should be "My account - my Store"1
