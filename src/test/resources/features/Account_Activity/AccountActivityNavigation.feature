
@account_activity
  Feature: As a user I want to be able to navigate in accounts in Accounts Activity

    Background:
      Given user is on login page
      And user logs in

      @a_a_page
      Scenario:
        And user navigates to "Account Activity"
        Then user should see "Zero - Account Activity" page displayed
