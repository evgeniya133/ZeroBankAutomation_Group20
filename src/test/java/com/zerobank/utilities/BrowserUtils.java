package com.zerobank.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    public static Select getSelectDropdown(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Select select = new Select(element);
        return select;
    }

    public static List<WebElement> getSelectDropdownOptions(WebElement element){
        Select select = getSelectDropdown(element);
        wait.until(ExpectedConditions.visibilityOfAllElements(select.getOptions()));

        List<WebElement> dropdownOptions = new ArrayList<>(select.getOptions());
        return dropdownOptions;
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void clickWithJS(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) (Driver.getDriver())).executeScript("arguments[0].click()", element);
    }

    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering text: " + text);
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elementsText = new ArrayList<>();
        for (WebElement each : list) {
            elementsText.add(each.getText());
        }
        return elementsText;
    }

}
