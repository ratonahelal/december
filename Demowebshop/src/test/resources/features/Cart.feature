Feature: Shopping Cart Functionality
Scenario: I would like to select a book and add it to the shopping cart
Given   Demowebshop home page open
When Click on Book Tab
And Click Add  Computing and Internet Book to cart button
And Click Shopping Cart link
Then  the book is on the shopping cart page.
