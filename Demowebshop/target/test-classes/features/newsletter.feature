
Feature: Sign up for our newsletter Functionality.
Scenario: I want to see Enter valid email when i put invalid email address at the subscribe box.

Given Open home Page
When Type invalid Email address
And click on subscribe box.
Then I will see  Enter valid email massage.

