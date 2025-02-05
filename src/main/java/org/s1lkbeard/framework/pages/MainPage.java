package org.s1lkbeard.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ancestor::button[contains(@data-marker, 'all-categories')]")
    WebElement allCat;
    @FindBy(xpath = "//p[contains(text(), 'Электроника')]")
    WebElement elect;
    @FindBy(xpath = "//strong[@data-name='Оргтехника и расходники']")
    WebElement orgAndConsumables;
    @FindBy(xpath = "//input[@data-marker='search-form/suggest']")
    WebElement searchString;
    @FindBy(xpath = "//button[@data-marker='search-form/submit-button']")
    WebElement searchButton;
    @FindBy(xpath = "//label[contains(@class, 'style-module-label')]//span[text()='Новое']")
    WebElement statusNew;
    @FindBy(xpath = "//span[text()='Новые']")
    WebElement checkboxNew;
    @FindBy(xpath = "//div[@data-marker='search-form/change-location']")
    WebElement region;
    @FindBy(xpath = "//input[contains(@placeholder, 'Город')]//following-sibling::div[@data-marker='clear-icon']")
    WebElement deleteButton;
    @FindBy(xpath = "//input[@placeholder='Город или регион']")
    WebElement enterRegion;
    @FindBy(xpath = "//strong[text()='Владивосток']/ancestor::li")
    WebElement chooseFirstCase;
    @FindBy(xpath = "//button[@data-marker='popup-location/save-button']")
    WebElement showResult;
    @FindBy(xpath = "//span[contains(text(), 'Сортировка')]/ancestor::div[contains(@class, 'sort_wrapper')]")
    WebElement sort;
    @FindBy(xpath = "//div[@role='listbox']/button//*[text()='Дороже']")
    WebElement typeOfSort;

    public MainPage fillField(String nameOfField, String string) {
        WebElement webElement = null;
        switch (nameOfField) {
            case "Поиск по сайту":
                webElement = searchString;
                break;
            case "Поиск по региону":
                webElement = enterRegion;
                break;
            default:
                System.out.println("Указанное поле отсутствует");
        }
        fillFieldBase(webElement, string);
        return this;
    }

    public MainPage clickField(String name) {
        WebElement webElement = null;
        switch (name) {
            case "Все категории":
                webElement = allCat;
                break;
            case "Электроника":
                webElement = elect;
                break;
            case "Оргтехника и расходники":
                webElement = orgAndConsumables;
                break;
            case "Найти":
                webElement = searchButton;
                break;
            case "Новое":
                webElement = statusNew;
                break;
            case "Новые":
                webElement = checkboxNew;
                break;
            case "Выбрать регион":
                webElement = region;
                break;
            case "Удалить выбранный регион":
                webElement = deleteButton;
                break;
            case "Выбрать первый вариант":
                webElement = chooseFirstCase;
                break;
            case "Показать результаты":
                webElement = showResult;
                break;
            case "Сортировка":
                webElement = sort;
                break;
            case "Дороже":
                webElement = typeOfSort;
                break;
            default:
                System.out.println("В репозитории отсутствует локатор указанного элемента");
        }
        clickFieldBase(webElement);
        return this;
    }

    public void printResult(int count) {
        System.out.println("Стоимость первых " + count + " лотов:");
        for (int i = 1; i < count+1; i++) {
            String str = "//div[contains(@class,'items-items')]/div[" + i + "]//strong//span";
            System.out.println("" + driverManager.getDriver().findElement(By.xpath(str)).getText());
        }
    }
}
