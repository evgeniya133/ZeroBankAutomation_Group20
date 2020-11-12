package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_definitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
      loginPage.getUrl();
    }

    @When("user logs in")
    public void user_logs_in() {
     loginPage.login();
    }

    @Then("user should see {string} displayed")
    public void user_should_see_displayed(String string) {
     loginPage.verifyTitle(string);
    }
  

    // negative Scenario
    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        loginPage.invalidLogin(string,string2);
    }


    @Then("user verifies {string} message is displayed")
    public void user_verifies_message_is_displayed(String string) {
        loginPage.getErrorMessage(string);
    }

}
