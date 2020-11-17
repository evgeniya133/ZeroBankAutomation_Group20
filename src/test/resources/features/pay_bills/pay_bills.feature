@PayBills
Feature: Pay Bills

  Background:
    Given user is on login page
    And user logs in
    When user navigates to "Pay Bills"


  Scenario: As a user I should be able to navigate to Pay Bills
    Then user should see "Zero - Pay Bills" displayed


  Scenario: As user I should not be able to make a payment if the amount and date are not entered
    When user clicks the pay button
    Then user should see the message "Please fill out this field." under amount input box
    And user enters 100 a valid amount
    And user clicks the pay button
    Then user should see the message "Please fill out this field." under date input box


  Scenario: As a user a should be able to pay a bill
    When user enters the following information to pay a bill
      | Payee       | Apple          |
      | Account     | Checking       |
      | Amount      | 250            |
      | Date        | 2020-11-1      |
      | Description | Laptop payment |
    And user clicks the pay button
    Then the message "The payment was successfully submitted." should be displayed if payment is successful



#  Scenario: As a user a should be able to pay a bill
#    When user enters the following information to pay a bill
#      | Payee       | Apple          |
#      | Account     | Checking       |
#      | Amount      | 250            |
#      | Date        | 2020-11-1      |
#      | Description | Laptop payment |
#    And user clicks the pay button
#    Then the message "The payment was successfully submitted." should be displayed if payment is successful  Scenario: As a user a should be able to pay a bill
#    When user enters the following information to pay a bill
#      | Payee       | Apple          |
#      | Account     | Checking       |
#      | Amount      | 250            |
#      | Date        | 2020-11-1      |
#      | Description | Laptop payment |
#    And user clicks the pay button
#    Then the message "The payment was successfully submitted." should be displayed if payment is successful



  AKRAM

   Mijat showing git GUI