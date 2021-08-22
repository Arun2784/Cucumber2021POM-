
Feature: Login Page feature

Scenario: Login Page Title
Given user is on login page
When user gets the title of the Page
Then page title should be "My Store"

Scenario: Forgot Password Link
Given user is on login page
Then Forgot Password link should be displayed

Scenario: Login With correct credentials
Given user is on login page
When User Enter UserName "Arunpandey2784@gmail.com"
And user Enter Password "Arun2784$"
And user clicks on Login Button
When user gets the title of the Page
And page title should be "My account - My Store"
