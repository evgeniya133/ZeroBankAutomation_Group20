@account_activity
Feature: As a user I want to be able to navigate in accounts in Accounts Activity

  Background:
    Given user is on login page
    And user logs in
    And user navigates to "Account Activity"

  @title
  Scenario: "Account Activity" page displayed
    Then user should see "Zero - Account Activity" page displayed

  @transaction_table
  Scenario Outline: validate transaction table
    Then transactions table should have column names "<Header1>", "<Header2>", "<Header3>", "<Header4>"

    Examples:
      | Header1 | Header2     | Header3 | Header4    |
      | Date    | Description | Deposit | Withdrawal |


