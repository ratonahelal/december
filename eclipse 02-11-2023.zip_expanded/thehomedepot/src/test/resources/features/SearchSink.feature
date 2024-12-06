Feature: HomeDepot Search Sink Functionality
@regression
Scenario: User able to search item
Given Open Home Depot Homepage
When search for Sink
And Click on Submit Search Button
Then Item list should have only Sink relates products
