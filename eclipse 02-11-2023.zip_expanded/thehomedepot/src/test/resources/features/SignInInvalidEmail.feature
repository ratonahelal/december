Feature: SignIn Invalid Email
@regression
Scenario: User will see an input error message when login with invalid email 
Given I am on the homepage
And I navigate to the loginpage
When I enter invalid email address
And click continue button
Then Input error message will pop up

