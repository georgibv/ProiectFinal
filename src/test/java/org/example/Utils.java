package org.example;

import org.openqa.selenium.*;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Utils {

    //Waits for an element to load for a specified period of time.
    public static void waitForElementToLoad(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Scrolls into view and waits for element to load.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);
    }

    public static Boolean checkPopupWithTextAlert(WebDriver driver, String toCheck) {
        String parentWindowHandler = driver.getWindowHandle();

        Alert alertWindow = driver.switchTo().alert();
        String sTxt = alertWindow.getText();
        Boolean isEqual =   sTxt.equals(toCheck);

        driver.switchTo().window(parentWindowHandler);  // switch back to parent window
        return isEqual;
    }



}