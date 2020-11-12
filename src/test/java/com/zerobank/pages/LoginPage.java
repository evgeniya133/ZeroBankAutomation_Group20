package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Properties;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='user_login']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@name='user_password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement SignInButton;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;

    public void getUrl(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }


    public void login(){
        wait.until(ExpectedConditions.visibilityOf(inputUsername));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        SignInButton.click();
    }


    public void verifyTitle(String expectedPageTitle){
        Assert.assertTrue(wait.until(ExpectedConditions.titleIs(expectedPageTitle)));
    }

    // negative Scenario
    public void invalidLogin(String worngUsername, String wrongPassword){
    inputUsername.sendKeys(worngUsername);
    inputPassword.sendKeys(wrongPassword);
    SignInButton.click();
    }


    public void getWarningMessage(String message){
        wait.until(ExpectedConditions.visibilityOf(warningMessage));
        Assert.assertEquals(warningMessage.getText(),message);

    }

}
