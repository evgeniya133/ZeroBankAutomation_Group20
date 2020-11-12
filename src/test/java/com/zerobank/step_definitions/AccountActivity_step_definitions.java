package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountActivity_step_definitions {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
            accountActivityPage.navigateTo(string);
    }

    @Then("user should see {string} page displayed")
    public void user_should_see_page_displayed(String expectedTitle) {
            accountActivityPage.verifyTitle(expectedTitle);
    }
}
