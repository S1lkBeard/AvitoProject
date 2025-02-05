package org.s1lkbeard.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.s1lkbeard.framework.managers.DriverManager;

import java.time.Duration;

public class BasePage {
    protected DriverManager driverManager = DriverManager.getDriverManager();
//    Duration timeOutInSeconds = Duration.ofSeconds(10);
//    Duration sleepInMillis = Duration.ofMillis(1000);
//    protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), timeOutInSeconds, sleepInMillis);

    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

    protected void clickFieldBase(WebElement webElement) {
        webElement.click();
    }

    protected void fillFieldBase(WebElement webElement, String string) {
        webElement.sendKeys(string);
    }
}