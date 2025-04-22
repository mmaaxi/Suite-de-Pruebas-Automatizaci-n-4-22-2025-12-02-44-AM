Feature: Invalid Login

  Scenario: User tries to log in with incorrect credentials
    Given a user is on the login page
    When the user enters an incorrect username and password
    Then an error message is displayed
    And the user is not logged in