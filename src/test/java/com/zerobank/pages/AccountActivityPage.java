package com.zerobank.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountActivityPage extends BasePage{

    public void verifyTitle(String titleExpected){
        wait.until(ExpectedConditions.titleIs(titleExpected));
    }


}
