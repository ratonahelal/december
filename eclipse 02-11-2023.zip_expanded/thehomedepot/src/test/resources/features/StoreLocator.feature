Feature: Home Depot NY Zipcode Store Locator
@regression
Scenario: Search with NY Zipcode
Given Open Home Depot Homepage
When click store finder link
And enter NY zipcode 
Then NY Stores options appear
