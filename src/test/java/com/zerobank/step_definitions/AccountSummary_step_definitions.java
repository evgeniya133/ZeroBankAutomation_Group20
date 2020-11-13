package com.zerobank.step_definitions;


import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

import java.util.List;

public class AccountSummary_step_definitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("user should see  displayed accounts")
    public void user_should_see_displayed_accounts(List<String> expectedAccount) {
        accountSummaryPage.verifyAccountTypes(expectedAccount);

    }

    @Then("Section should have columns names")
    public void section_should_have_columns_names(List<String>expectedHeader) {
        accountSummaryPage.verifyColumns(expectedHeader);

    }






}

