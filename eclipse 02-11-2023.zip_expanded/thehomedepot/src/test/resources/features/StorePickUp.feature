Feature: HomeDepot Search For Store Pick Up Functionality
@regression
Scenario: User able to get item fast
Given Open Home Depot Homepage
When search for wood
And Click on Submit Search Button
And Click in stock at Store Today
Then available items appear for store pickup
