@account_summary @smoke
Feature: As a user I want to be able to navigate in accounts in Accounts Activity

  Background:
    Given user is on login page
    And user logs in
    And user navigates to "Account Summary"

  @title
  Scenario: "Account Summary" page displayed
    Then user should see "Zero - Account Summary" page displayed

  @summary_accounts_types
  Scenario: verify Account Summary Sections
    Then user should see  displayed accounts
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  @credit_accounts_columns
  Scenario: verify Credit Accounts Section
    Then Section should have columns names
      | Account     |
      | Credit Card |
      | Balance     |

# testing