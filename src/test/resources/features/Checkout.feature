Feature: Checkout function

Scenario: Valid login
Given User is on login Page
When User enters Credential
Then User is on Home Page

Scenario: Search Item
Given User is on Home Page
When User search an "Parry Hotter"
Then Should display Search result Page
#And Navigate to Item Detail Page

Scenario: AddItem to Cart
Given Navigate to Item Detail Page
When User add item to cart
Then Item must be available in cart

Scenario: Checkout Items
Given Item must be available in cart
When User Checkout
Then Order must checkedout
 