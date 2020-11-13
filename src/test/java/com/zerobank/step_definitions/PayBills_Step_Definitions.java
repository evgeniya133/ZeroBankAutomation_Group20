package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class PayBills_Step_Definitions {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("user clicks the pay button")
    public void user_clicks_the_pay_button() {
        payBillsPage.clickPay();
    }


    @Then("user should see the message {string} under amount input box")
    public void user_should_see_the_message_under_amount_input_box(String message) {
        payBillsPage.amountValidationMessage(message);

    }

    @Then("user enters {int} a valid amount")
    public void user_enters_a_valid_amount(Integer amount) {
        payBillsPage.enterAmount(amount);

    }

    @Then("user should see the message {string} under date input box")
    public void user_should_see_the_message_under_date_input_box(String message) {
        payBillsPage.dateValidationMessage(message);
    }

    @When("user enters the following information to pay a bill")
    public void user_enters_the_following_information_to_pay_a_bill(Map<String, String> billInfo) {
        payBillsPage.payBill(billInfo);
    }


    @Then("the message {string} should be displayed if payment is successful")
    public void the_message_should_be_displayed_if_payment_is_successful(String expectedMessage) {
        payBillsPage.paymentMessageEquals(expectedMessage);
    }
}
