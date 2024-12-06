Feature: Feature: HomeDepot Search Get It Fast Next days delivery Functionality
@regression
Scenario: User able to get item fast
Given Open Home Depot Homepage
When search for Nails
And Click on Submit Search Button
And Click in Next day delivery 
Then Item list should have only delivery scheduled
