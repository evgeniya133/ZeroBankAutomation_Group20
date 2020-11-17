package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

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

    @Then("{string} account should be selected")
    public void account_should_be_selected(String string) {
        accountActivityPage.verifySavingsOptionDefault();
    }

    @Given("user clicks on Account drop-down")
    public void user_clicks_on_drop_down() {
        accountActivityPage.clickOnDropdown();
    }

    //Scenario will fail because there are two savings options instead of one
    @Then("user should see available options")
    public void user_should_see_available_options(List<String> expectedOptions) {
        accountActivityPage.verifyOptions(expectedOptions);
    }

}
