@login @smoke
Feature: As user I want to be able to login with valid credentials

  Background:
    Given user is on login page


  @valid_credentials
  Scenario: Login with valid credentials
    When user logs in
    Then user should see "Zero - Account Summary" displayed

  @negative
  Scenario Outline: Invalid credentials
    When user logs in with "<username>" username and "<password>" password
    Then user verifies "<message>" message is displayed

    Examples: data set
      | username | password | message                          |
      | username | wrong    | Login and/or password are wrong. |
      | wrong    | password | Login and/or password are wrong. |
      |          | password | Login and/or password are wrong. |
      | username |          | Login and/or password are wrong. |

  @log_out
  Scenario: Logging out of application
    When user logs in
    And user should see "Zero - Account Summary" displayed
    Then user should be able to logout


