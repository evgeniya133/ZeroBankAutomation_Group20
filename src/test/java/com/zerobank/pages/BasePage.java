package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);





    public void navigateTo(String tabString){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

        WebElement tab = Driver.getDriver().findElement(By.linkText(tabString));


    }

}
