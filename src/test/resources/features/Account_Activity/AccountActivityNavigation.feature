@account_activity @smoke
Feature: As a user I want to be able to navigate in accounts in Accounts Activity

  Background:
    Given user is on login page
    And user logs in
    And user navigates to "Account Activity"

  @title
  Scenario: "Account Activity" page displayed
    Then user should see "Zero - Account Activity" page displayed

  @savings_dropdown_default
  Scenario: Savings account should be selected by default
    Then "Savings" account should be selected

  @transaction_table
  Scenario: validate transaction table
    Then transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
