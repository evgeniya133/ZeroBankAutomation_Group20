package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.cy_gb.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{



    @FindBy(xpath = "(//div[@class='span12'])[2]")
    private WebElement AccountSummary;


    @FindBy(xpath = "(//table[@class='table'])[3]")
    private WebElement CreditAccountsTable;



    public void verifyAccountTypes(List<String> expectedAccount){
        List<WebElement> accountElements = AccountSummary.findElements(By.tagName("h2"));
        List<String> actualAccount = BrowserUtils.getElementsText(accountElements);

        Assert.assertEquals("Account types are not matching",expectedAccount,actualAccount);
    }


    public void verifyColumns(List<String>expectedHeader){
        List<WebElement> headerElements = CreditAccountsTable.findElements(By.tagName("th"));
        List<String> actualHeader = BrowserUtils.getElementsText(headerElements);

        Assert.assertEquals("Headers are not matching", expectedHeader, actualHeader);
    }





}
