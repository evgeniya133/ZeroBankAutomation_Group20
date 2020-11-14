package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;

public class CommonStepDefinitions {

    BasePage basePage = new LoginPage();

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() {
        basePage.logout();
    }

}
