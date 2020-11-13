package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
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

    public void verifyHeaders(List<String> expectedHeaderText){

        List<WebElement> headerElements = transactionTable.findElements(By.tagName("th"));
        List<String> actualHeadersText = BrowserUtils.getElementsText(headerElements);

        Assert.assertEquals("Headers are not matching", expectedHeaderText, actualHeadersText);

    }


}
