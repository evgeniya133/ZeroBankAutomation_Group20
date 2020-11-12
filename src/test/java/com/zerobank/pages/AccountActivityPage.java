package com.zerobank.pages;

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

    public void verifyTitle(String titleExpected){
        wait.until(ExpectedConditions.titleIs(titleExpected));
    }

    public void verifyHeaders(String string1, String string2, String string3, String string4){

        List<WebElement> headers = transactionTable.findElements(By.tagName("th"));
        List<String> actualHeadersText = new ArrayList<>();

            for (WebElement each : headers) {
               actualHeadersText.add(each.getText());
           }

        List<String> expectedHeadersText = new ArrayList<>();
        expectedHeadersText.addAll(Arrays.asList(string1, string2, string3, string4));

        Assert.assertEquals("Headers are not matching", expectedHeadersText, actualHeadersText);

    }


}
