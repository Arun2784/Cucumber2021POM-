Feature: Account Page Feature

Background:
Given user has already logged in to application
|username |password |
|arunpandey2784@gmail.com |Arun2784$ |
  
 Scenario: Accounts Page title
 Given user is on Accounts Page
 When user gets the title of the Page
 Then page title should be "My account - My Store"
  
  
 Scenario: Accounts section count
 Given user is on Accounts Page
 Then user gets accounts section
 |ORDER HISTORY AND DETAILS |
 |MY CREDIT SLIPS |
 |MY ADDRESSES |
 |MY PERSONAL INFORMATION |
 |MY WISHLISTS |
  |Home |
 And accounts section count should be 6