Feature: HomeDepot Recent Search Functionality
@regression
Scenario: User able to click and see recent search
Given Open Home Depot Homepage
When search for Glue Guns
And Click on Submit Search Button
And search for Paint on the search 
And Click on Submit Search Button
Then all the recent search items appear
