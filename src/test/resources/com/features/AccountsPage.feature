Feature: Account Page Feature

Background:
Given user has already logged in to application
|username |Password |
|arunpandey2784@gmail.com |Arun2784$ |
  
 Scenario: Accounts Page title
 Given user is on Accounts Page
 When user gets the title of the Page
 Then page title should be "My account - My Store"
  
  
 Scenario: Accounts section count
 Given user is on Accounts Page
 Then user gets accounts section
 |Order history and details |
 |My credit slips |
 |My addresses |
 |My personal information |
 |My wishlists |
 And accounts section count should be 5 