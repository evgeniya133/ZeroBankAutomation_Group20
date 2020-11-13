package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(css = "table[class='table table-condensed table-hover']")
    private WebElement transactionTable;

    @FindBy(id = "aa_accountId")
    private WebElement accountDropDown;

    public void verifyHeaders(List<String> expectedHeaderText){

        List<WebElement> headerElements = transactionTable.findElements(By.tagName("th"));
        List<String> actualHeadersText = BrowserUtils.getElementsText(headerElements);

        Assert.assertEquals("Headers are not matching", expectedHeaderText, actualHeadersText);

    }

    public void verifySavingsOptionDefault(){
        wait.until(ExpectedConditions.visibilityOf(accountDropDown));

        String expectedOption = "Savings";
        String actualOption = BrowserUtils.getSelectDropdown(accountDropDown).getFirstSelectedOption().getText();

        Assert.assertEquals("Savings option is not selected by default! Test Failed!!", expectedOption, actualOption);
    }

}
