package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @FindBy(xpath = "(//a[@class = 'dropdown-toggle'])[2]")
    private WebElement userNameDropdown;

    @FindBy(id = "logout_link")
    private WebElement logoutLink;

    public void navigateTo(String tabName){
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(tabName))).click();
    }

    public void verifyTitle(String expectedPageTitle){
        Assert.assertTrue(wait.until(ExpectedConditions.titleIs(expectedPageTitle)));

    }

    public void logout(){

        userNameDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(logoutLink)).click();

        String expectedTitle = "Zero - Personal Banking - Loans - Credit Cards";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not equal! Test failed!!!" ,actualTitle.contains(expectedTitle));

    }

}
