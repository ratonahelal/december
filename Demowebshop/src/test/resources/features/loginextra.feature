Feature: Login Functionality extra.

  Scenario: As a user I want to login extra
    Given Open home Page
    When I click on login link
    And I enter username and password
    
      | username | abcdjon@gmail.com  |
      | password | 123456    |
      
    And I click on Remember me
    And I click on login
    And I will be logged in
    Then I click on Log out


