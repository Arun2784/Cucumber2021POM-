
Feature: Login Page feature

Scenario: Login Page Title
Given user is on login page
When User gets the title of the Page
Then Page title should be " Login - My Store"

Scenario: Forgot Password Link
Given user is on Login page
Then Forgot Password link should be displayed

Scenario: Login With correct credentials

Given User is on Login page
When User Enter UserName "Arunpandey2784@gmail.com"
And user Enter Password "Arun2784$"
And user clicks on Login Button
Then User gets the title of the home Page
And Page title should be "My account - my Store"
