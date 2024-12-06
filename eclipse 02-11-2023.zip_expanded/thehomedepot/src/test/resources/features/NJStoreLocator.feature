Feature: Home Depot NJ Zipcode Store Locator
@regression
Scenario: Search with NJ Zipcode
Given Open Home Depot Homepage
When click store finder link
And enter NJ zipcode 
Then NJ Stores options appear
