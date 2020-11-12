package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "user_login")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement errorMessage;

    public void login(){
        String usernameInput = ConfigurationReader.getProperty("username");
        String passwordInput = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(usernameInput);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwordInput, Keys.ENTER);
    }

    public String getErrorMessage(){
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText().trim(); // deleted unnecessary variable
    }

    public String getPageTitleText(){
        return Driver.getDriver().getTitle().trim();
    }

    public void verifyTitle(String expectedPageTitle){
        Assert.assertTrue(wait.until(ExpectedConditions.titleIs(expectedPageTitle)));
    }

}
