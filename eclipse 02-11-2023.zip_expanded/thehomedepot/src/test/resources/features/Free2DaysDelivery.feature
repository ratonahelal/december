Feature: HomeDepot Search Get It Fast Free 2 days delivery Functionality
@regression
Scenario: User able to get item fast
Given Open Home Depot Homepage
When search for snow blower
And Click on Submit Search Button
And Click in free 2 days delivery 
Then Item list should have only for free delivery 
