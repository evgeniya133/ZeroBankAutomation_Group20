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
  

}
