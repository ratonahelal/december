Feature: HomeDepot Search SnowBlower Functionality
@regression
Scenario: User able to search item
Given Open Home Depot Homepage
When search for SnowBlower
And Click on Submit Search Button
Then Item list should have only Snow Blower relates products
