Feature: HomeDepot Search Heaters Functionality
@regression
Scenario: User search for Heaters
Given Open Home Depot Homepage
When Search for heater
And Click on Submit Search Button
Then Item list should have only Heater relates products
