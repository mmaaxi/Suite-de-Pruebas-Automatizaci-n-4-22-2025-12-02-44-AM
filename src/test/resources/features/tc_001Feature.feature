Feature: Valid Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters a valid username and password
    And the user clicks on the login button
    Then the user is redirected to the dashboard page