package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class PayBillsPage extends BasePage{

    @FindBy(id = "pay_saved_payees")
    private WebElement payButton;

    @FindBy(xpath = "//input[@id='sp_date']")
    private WebElement dateButton;

    @FindBy(xpath = "//input[@id='sp_amount']")
    private WebElement amountInputBox;

    @FindBy(id = "alert_content")
    private WebElement alertPaymentMessage;


    public void clickPay(){
        wait.until(ExpectedConditions.visibilityOf(payButton)).click();
    }

    public void amountValidationMessage(String expectedMessage){
        String validationMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sp_amount']"))).getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage, validationMessage);
    }

    public void dateValidationMessage(String expectedMessage){
        String validationMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sp_date']"))).getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage, validationMessage);
    }

    public void enterAmount(int amount){
        amountInputBox.sendKeys(String.valueOf(amount));
    }

    public void enterDate(String date){
        amountInputBox.sendKeys(date);
    }


    public void payBill(Map<String, String> payBillInfo){

        for (Map.Entry<String, String > info: payBillInfo.entrySet()) {
            String eachKey = info.getKey().toLowerCase();

            if(eachKey.equals("payee") || eachKey.equals("account")){
                WebElement select = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(eachKey)));
                Select selectDropdown = BrowserUtils.getSelectDropdown(select);
                selectDropdown.selectByVisibleText(info.getValue());
            }else {
                String idAttribute = "sp_"+info.getKey().toLowerCase();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idAttribute))).sendKeys(info.getValue());
            }
        }
        clickPay();
    }

    public void paymentMessageEquals(String expectedMessage){
        String actualMessage = wait.until(ExpectedConditions.visibilityOf(alertPaymentMessage)).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
