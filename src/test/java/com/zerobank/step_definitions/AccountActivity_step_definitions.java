package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class AccountActivity_step_definitions {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
            accountActivityPage.navigateTo(string);
    }

    @Then("user should see {string} page displayed")
    public void user_should_see_page_displayed(String string) {
        accountActivityPage.verifyTitle(string);
    }

    @Then("transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expectedHeaders) {
        accountActivityPage.verifyHeaders(expectedHeaders);
    }


}
